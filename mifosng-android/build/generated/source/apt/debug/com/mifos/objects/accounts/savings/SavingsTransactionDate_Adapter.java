package com.mifos.objects.accounts.savings;

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

public final class SavingsTransactionDate_Adapter extends ModelAdapter<SavingsTransactionDate> {
  public SavingsTransactionDate_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<SavingsTransactionDate> getModelClass() {
    return SavingsTransactionDate.class;
  }

  public final String getTableName() {
    return "`SavingsTransactionDate`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return SavingsTransactionDate_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, SavingsTransactionDate model) {
    if (model.transactionId != null) {
      values.put(SavingsTransactionDate_Table.transactionId.getCursorKey(), model.transactionId);
    } else {
      values.putNull(SavingsTransactionDate_Table.transactionId.getCursorKey());
    }
    if (model.year != null) {
      values.put(SavingsTransactionDate_Table.year.getCursorKey(), model.year);
    } else {
      values.putNull(SavingsTransactionDate_Table.year.getCursorKey());
    }
    if (model.month != null) {
      values.put(SavingsTransactionDate_Table.month.getCursorKey(), model.month);
    } else {
      values.putNull(SavingsTransactionDate_Table.month.getCursorKey());
    }
    if (model.day != null) {
      values.put(SavingsTransactionDate_Table.day.getCursorKey(), model.day);
    } else {
      values.putNull(SavingsTransactionDate_Table.day.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, SavingsTransactionDate model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, SavingsTransactionDate model, int start) {
    if (model.transactionId != null) {
      statement.bindLong(1 + start, model.transactionId);
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
    if (model.day != null) {
      statement.bindLong(4 + start, model.day);
    } else {
      statement.bindNull(4 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, SavingsTransactionDate model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `SavingsTransactionDate`(`transactionId`,`year`,`month`,`day`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `SavingsTransactionDate`(`transactionId`,`year`,`month`,`day`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `SavingsTransactionDate`(`transactionId` INTEGER,`year` INTEGER,`month` INTEGER,`day` INTEGER, PRIMARY KEY(`transactionId`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, SavingsTransactionDate model) {
    int indextransactionId = cursor.getColumnIndex("transactionId");
    if (indextransactionId != -1 && !cursor.isNull(indextransactionId)) {
      model.transactionId = cursor.getInt(indextransactionId);
    } else {
      model.transactionId = null;
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
    int indexday = cursor.getColumnIndex("day");
    if (indexday != -1 && !cursor.isNull(indexday)) {
      model.day = cursor.getInt(indexday);
    } else {
      model.day = null;
    }
  }

  @Override
  public final boolean exists(SavingsTransactionDate model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingsTransactionDate.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(SavingsTransactionDate model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingsTransactionDate_Table.transactionId.eq(model.transactionId));return clause;
  }

  @Override
  public final SavingsTransactionDate newInstance() {
    return new SavingsTransactionDate();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return SavingsTransactionDate_Table.getProperty(name);
  }
}
