package com.mifos.objects.templates.savings;

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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

public final class SavingsAccountTransactionTemplate_Adapter extends ModelAdapter<SavingsAccountTransactionTemplate> {
  public SavingsAccountTransactionTemplate_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<SavingsAccountTransactionTemplate> getModelClass() {
    return SavingsAccountTransactionTemplate.class;
  }

  public final String getTableName() {
    return "`SavingsAccountTransactionTemplate`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return SavingsAccountTransactionTemplate_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, SavingsAccountTransactionTemplate model) {
    if (model.accountId != null) {
      values.put(SavingsAccountTransactionTemplate_Table.accountId.getCursorKey(), model.accountId);
    } else {
      values.putNull(SavingsAccountTransactionTemplate_Table.accountId.getCursorKey());
    }
    if (model.accountNo != null) {
      values.put(SavingsAccountTransactionTemplate_Table.accountNo.getCursorKey(), model.accountNo);
    } else {
      values.putNull(SavingsAccountTransactionTemplate_Table.accountNo.getCursorKey());
    }
    Integer refreversed = model.reversed != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.reversed) : null;
    if (refreversed != null) {
      values.put(SavingsAccountTransactionTemplate_Table.reversed.getCursorKey(), refreversed);
    } else {
      values.putNull(SavingsAccountTransactionTemplate_Table.reversed.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, SavingsAccountTransactionTemplate model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, SavingsAccountTransactionTemplate model, int start) {
    if (model.accountId != null) {
      statement.bindLong(1 + start, model.accountId);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.accountNo != null) {
      statement.bindString(2 + start, model.accountNo);
    } else {
      statement.bindNull(2 + start);
    }
    Integer refreversed = model.reversed != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.reversed) : null;
    if (refreversed != null) {
      statement.bindLong(3 + start, refreversed);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, SavingsAccountTransactionTemplate model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `SavingsAccountTransactionTemplate`(`accountId`,`accountNo`,`reversed`) VALUES (?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `SavingsAccountTransactionTemplate`(`accountId`,`accountNo`,`reversed`) VALUES (?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `SavingsAccountTransactionTemplate`(`accountId` INTEGER,`accountNo` TEXT,`reversed` INTEGER, PRIMARY KEY(`accountId`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, SavingsAccountTransactionTemplate model) {
    int indexaccountId = cursor.getColumnIndex("accountId");
    if (indexaccountId != -1 && !cursor.isNull(indexaccountId)) {
      model.accountId = cursor.getInt(indexaccountId);
    } else {
      model.accountId = null;
    }
    int indexaccountNo = cursor.getColumnIndex("accountNo");
    if (indexaccountNo != -1 && !cursor.isNull(indexaccountNo)) {
      model.accountNo = cursor.getString(indexaccountNo);
    } else {
      model.accountNo = null;
    }
    int indexreversed = cursor.getColumnIndex("reversed");
    if (indexreversed != -1 && !cursor.isNull(indexreversed)) {
      model.reversed = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexreversed));
    } else {
      model.reversed = null;
    }
  }

  @Override
  public final boolean exists(SavingsAccountTransactionTemplate model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingsAccountTransactionTemplate.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(SavingsAccountTransactionTemplate model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingsAccountTransactionTemplate_Table.accountId.eq(model.accountId));return clause;
  }

  @Override
  public final SavingsAccountTransactionTemplate newInstance() {
    return new SavingsAccountTransactionTemplate();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return SavingsAccountTransactionTemplate_Table.getProperty(name);
  }
}
