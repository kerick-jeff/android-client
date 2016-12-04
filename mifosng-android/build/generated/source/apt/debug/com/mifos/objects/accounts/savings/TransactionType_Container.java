package com.mifos.objects.accounts.savings;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.Method;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.structure.container.ForeignKeyContainer;
import com.raizlabs.android.dbflow.structure.container.ModelContainer;
import com.raizlabs.android.dbflow.structure.container.ModelContainerAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class TransactionType_Container extends ModelContainerAdapter<TransactionType> {
  public TransactionType_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("deposit", Boolean.class);
    columnMap.put("withdrawal", Boolean.class);
  }

  @Override
  public final Class<TransactionType> getModelClass() {
    return TransactionType.class;
  }

  public final String getTableName() {
    return "`TransactionType`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<TransactionType, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(TransactionType_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(TransactionType_Table.id.getCursorKey());
    }
    Integer modelContainerdeposit = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("deposit"));
    if (modelContainerdeposit != null) {
      values.put(TransactionType_Table.deposit.getCursorKey(), modelContainerdeposit);
    } else {
      values.putNull(TransactionType_Table.deposit.getCursorKey());
    }
    Integer modelContainerwithdrawal = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("withdrawal"));
    if (modelContainerwithdrawal != null) {
      values.put(TransactionType_Table.withdrawal.getCursorKey(), modelContainerwithdrawal);
    } else {
      values.putNull(TransactionType_Table.withdrawal.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<TransactionType, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<TransactionType, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    Integer modelContainerdeposit = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("deposit"));
    if (modelContainerdeposit != null) {
      statement.bindLong(2 + start, modelContainerdeposit);
    } else {
      statement.bindNull(2 + start);
    }
    Integer modelContainerwithdrawal = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("withdrawal"));
    if (modelContainerwithdrawal != null) {
      statement.bindLong(3 + start, modelContainerwithdrawal);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<TransactionType, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<TransactionType, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(TransactionType.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<TransactionType, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(TransactionType_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final TransactionType toModel(ModelContainer<TransactionType, ?> modelContainer) {
    TransactionType model = new TransactionType();
    model.id = modelContainer.getIntegerValue("id");
    model.deposit = modelContainer.getBooleanValue("deposit");
    model.withdrawal = modelContainer.getBooleanValue("withdrawal");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<TransactionType, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexdeposit = cursor.getColumnIndex("deposit");
    if (indexdeposit != -1 && !cursor.isNull(indexdeposit)) {
      modelContainer.put("deposit", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexdeposit)));
    } else {
      modelContainer.putDefault("deposit");
    }
    int indexwithdrawal = cursor.getColumnIndex("withdrawal");
    if (indexwithdrawal != -1 && !cursor.isNull(indexwithdrawal)) {
      modelContainer.put("withdrawal", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexwithdrawal)));
    } else {
      modelContainer.putDefault("withdrawal");
    }
  }

  @Override
  public final ForeignKeyContainer<TransactionType> toForeignKeyContainer(TransactionType model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(TransactionType.class);
    modelContainer.put(TransactionType_Table.id, model.id);
    return modelContainer;
  }
}
