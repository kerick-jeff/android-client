package com.mifos.objects.accounts.loan;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.config.FlowManager;
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

public final class Timeline_Adapter extends ModelAdapter<Timeline> {
  public Timeline_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Timeline> getModelClass() {
    return Timeline.class;
  }

  public final String getTableName() {
    return "`Timeline`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Timeline_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Timeline model) {
    if (model.loanId != null) {
      values.put(Timeline_Table.loanId.getCursorKey(), model.loanId);
    } else {
      values.putNull(Timeline_Table.loanId.getCursorKey());
    }
    if (model.actualDisburseDate != null) {
      model.actualDisburseDate.save();
      if (model.actualDisburseDate.loanId != null) {
        values.put(Timeline_Table.actualDisburseDate_loanId.getCursorKey(), model.actualDisburseDate.loanId);
      } else {
        values.putNull(Timeline_Table.actualDisburseDate_loanId.getCursorKey());
      }
    } else {
      values.putNull("`actualDisburseDate_loanId`");
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Timeline model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Timeline model, int start) {
    if (model.loanId != null) {
      statement.bindLong(1 + start, model.loanId);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.actualDisburseDate != null) {
      model.actualDisburseDate.save();
      if (model.actualDisburseDate.loanId != null) {
        statement.bindLong(2 + start, model.actualDisburseDate.loanId);
      } else {
        statement.bindNull(2 + start);
      }
    } else {
      statement.bindNull(2 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Timeline model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Timeline`(`loanId`,`actualDisburseDate_loanId`) VALUES (?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Timeline`(`loanId`,`actualDisburseDate_loanId`) VALUES (?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Timeline`(`loanId` INTEGER,`actualDisburseDate_loanId` INTEGER, PRIMARY KEY(`loanId`)"+ ", FOREIGN KEY(`actualDisburseDate_loanId`) REFERENCES " + FlowManager.getTableName(ActualDisbursementDate.class) + "(`loanId`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Timeline model) {
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      model.loanId = cursor.getInt(indexloanId);
    } else {
      model.loanId = null;
    }
    //// Only load model if references match, for efficiency
    int indexactualDisburseDate_loanId = cursor.getColumnIndex("actualDisburseDate_loanId");
    if (indexactualDisburseDate_loanId != -1 && !cursor.isNull(indexactualDisburseDate_loanId)) {
      model.actualDisburseDate = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.ActualDisbursementDate.class).where()
          .and(com.mifos.objects.accounts.loan.ActualDisbursementDate_Table.loanId.eq(cursor.getInt(indexactualDisburseDate_loanId))).querySingle();
    }
  }

  @Override
  public final boolean exists(Timeline model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Timeline.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Timeline model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Timeline_Table.loanId.eq(model.loanId));return clause;
  }

  @Override
  public final Timeline newInstance() {
    return new Timeline();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Timeline_Table.getProperty(name);
  }
}
