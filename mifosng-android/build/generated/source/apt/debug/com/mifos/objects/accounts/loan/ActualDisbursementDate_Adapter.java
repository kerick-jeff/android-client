package com.mifos.objects.accounts.loan;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.Method;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

public final class ActualDisbursementDate_Adapter extends ModelAdapter<ActualDisbursementDate> {
  public ActualDisbursementDate_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<ActualDisbursementDate> getModelClass() {
    return ActualDisbursementDate.class;
  }

  public final String getTableName() {
    return "`ActualDisbursementDate`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ActualDisbursementDate_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ActualDisbursementDate model) {
    if (model.loanId != null) {
      values.put(ActualDisbursementDate_Table.loanId.getCursorKey(), model.loanId);
    } else {
      values.putNull(ActualDisbursementDate_Table.loanId.getCursorKey());
    }
    if (model.year != null) {
      values.put(ActualDisbursementDate_Table.year.getCursorKey(), model.year);
    } else {
      values.putNull(ActualDisbursementDate_Table.year.getCursorKey());
    }
    if (model.month != null) {
      values.put(ActualDisbursementDate_Table.month.getCursorKey(), model.month);
    } else {
      values.putNull(ActualDisbursementDate_Table.month.getCursorKey());
    }
    if (model.date != null) {
      values.put(ActualDisbursementDate_Table.date.getCursorKey(), model.date);
    } else {
      values.putNull(ActualDisbursementDate_Table.date.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ActualDisbursementDate model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ActualDisbursementDate model, int start) {
    if (model.loanId != null) {
      statement.bindLong(1 + start, model.loanId);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.year != null) {
      statement.bindLong(2 + start, model.year);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.month != null) {
      statement.bindLong(3 + start, model.month);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.date != null) {
      statement.bindLong(4 + start, model.date);
    } else {
      statement.bindNull(4 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ActualDisbursementDate model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ActualDisbursementDate`(`loanId`,`year`,`month`,`date`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ActualDisbursementDate`(`loanId`,`year`,`month`,`date`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ActualDisbursementDate`(`loanId` INTEGER,`year` INTEGER,`month` INTEGER,`date` INTEGER, PRIMARY KEY(`loanId`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ActualDisbursementDate model) {
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      model.loanId = cursor.getInt(indexloanId);
    } else {
      model.loanId = null;
    }
    int indexyear = cursor.getColumnIndex("year");
    if (indexyear != -1 && !cursor.isNull(indexyear)) {
      model.year = cursor.getInt(indexyear);
    } else {
      model.year = null;
    }
    int indexmonth = cursor.getColumnIndex("month");
    if (indexmonth != -1 && !cursor.isNull(indexmonth)) {
      model.month = cursor.getInt(indexmonth);
    } else {
      model.month = null;
    }
    int indexdate = cursor.getColumnIndex("date");
    if (indexdate != -1 && !cursor.isNull(indexdate)) {
      model.date = cursor.getInt(indexdate);
    } else {
      model.date = null;
    }
  }

  @Override
  public final boolean exists(ActualDisbursementDate model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(ActualDisbursementDate.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ActualDisbursementDate model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(ActualDisbursementDate_Table.loanId.eq(model.loanId));return clause;
  }

  @Override
  public final ActualDisbursementDate newInstance() {
    return new ActualDisbursementDate();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return ActualDisbursementDate_Table.getProperty(name);
  }
}
