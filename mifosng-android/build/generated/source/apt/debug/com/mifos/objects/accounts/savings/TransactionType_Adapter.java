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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

public final class TransactionType_Adapter extends ModelAdapter<TransactionType> {
  public TransactionType_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<TransactionType> getModelClass() {
    return TransactionType.class;
  }

  public final String getTableName() {
    return "`TransactionType`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return TransactionType_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, TransactionType model) {
    if (model.id != null) {
      values.put(TransactionType_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(TransactionType_Table.id.getCursorKey());
    }
    Integer refdeposit = model.deposit != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.deposit) : null;
    if (refdeposit != null) {
      values.put(TransactionType_Table.deposit.getCursorKey(), refdeposit);
    } else {
      values.putNull(TransactionType_Table.deposit.getCursorKey());
    }
    Integer refwithdrawal = model.withdrawal != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.withdrawal) : null;
    if (refwithdrawal != null) {
      values.put(TransactionType_Table.withdrawal.getCursorKey(), refwithdrawal);
    } else {
      values.putNull(TransactionType_Table.withdrawal.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, TransactionType model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, TransactionType model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    Integer refdeposit = model.deposit != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.deposit) : null;
    if (refdeposit != null) {
      statement.bindLong(2 + start, refdeposit);
    } else {
      statement.bindNull(2 + start);
    }
    Integer refwithdrawal = model.withdrawal != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.withdrawal) : null;
    if (refwithdrawal != null) {
      statement.bindLong(3 + start, refwithdrawal);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, TransactionType model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `TransactionType`(`id`,`deposit`,`withdrawal`) VALUES (?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `TransactionType`(`id`,`deposit`,`withdrawal`) VALUES (?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `TransactionType`(`id` INTEGER,`deposit` INTEGER,`withdrawal` INTEGER, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, TransactionType model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
    }
    int indexdeposit = cursor.getColumnIndex("deposit");
    if (indexdeposit != -1 && !cursor.isNull(indexdeposit)) {
      model.deposit = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexdeposit));
    } else {
      model.deposit = null;
    }
    int indexwithdrawal = cursor.getColumnIndex("withdrawal");
    if (indexwithdrawal != -1 && !cursor.isNull(indexwithdrawal)) {
      model.withdrawal = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexwithdrawal));
    } else {
      model.withdrawal = null;
    }
  }

  @Override
  public final boolean exists(TransactionType model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(TransactionType.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(TransactionType model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(TransactionType_Table.id.eq(model.id));return clause;
  }

  @Override
  public final TransactionType newInstance() {
    return new TransactionType();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return TransactionType_Table.getProperty(name);
  }
}
