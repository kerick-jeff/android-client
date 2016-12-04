package com.mifos.objects.templates.savings;

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
public final class SavingsAccountTransactionTemplate_Container extends ModelContainerAdapter<SavingsAccountTransactionTemplate> {
  public SavingsAccountTransactionTemplate_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("accountId", Integer.class);
    columnMap.put("accountNo", String.class);
    columnMap.put("reversed", Boolean.class);
  }

  @Override
  public final Class<SavingsAccountTransactionTemplate> getModelClass() {
    return SavingsAccountTransactionTemplate.class;
  }

  public final String getTableName() {
    return "`SavingsAccountTransactionTemplate`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<SavingsAccountTransactionTemplate, ?> modelContainer) {
    Integer modelContaineraccountId = modelContainer.getIntegerValue("accountId");
    if (modelContaineraccountId != null) {
      values.put(SavingsAccountTransactionTemplate_Table.accountId.getCursorKey(), modelContaineraccountId);
    } else {
      values.putNull(SavingsAccountTransactionTemplate_Table.accountId.getCursorKey());
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      values.put(SavingsAccountTransactionTemplate_Table.accountNo.getCursorKey(), modelContaineraccountNo);
    } else {
      values.putNull(SavingsAccountTransactionTemplate_Table.accountNo.getCursorKey());
    }
    Integer modelContainerreversed = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("reversed"));
    if (modelContainerreversed != null) {
      values.put(SavingsAccountTransactionTemplate_Table.reversed.getCursorKey(), modelContainerreversed);
    } else {
      values.putNull(SavingsAccountTransactionTemplate_Table.reversed.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<SavingsAccountTransactionTemplate, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<SavingsAccountTransactionTemplate, ?> modelContainer, int start) {
    Integer modelContaineraccountId = modelContainer.getIntegerValue("accountId");
    if (modelContaineraccountId != null) {
      statement.bindLong(1 + start, modelContaineraccountId);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      statement.bindString(2 + start, modelContaineraccountNo);
    } else {
      statement.bindNull(2 + start);
    }
    Integer modelContainerreversed = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("reversed"));
    if (modelContainerreversed != null) {
      statement.bindLong(3 + start, modelContainerreversed);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<SavingsAccountTransactionTemplate, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<SavingsAccountTransactionTemplate, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingsAccountTransactionTemplate.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<SavingsAccountTransactionTemplate, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingsAccountTransactionTemplate_Table.accountId.eq(modelContainer.getIntegerValue("accountId")));return clause;
  }

  @Override
  public final SavingsAccountTransactionTemplate toModel(ModelContainer<SavingsAccountTransactionTemplate, ?> modelContainer) {
    SavingsAccountTransactionTemplate model = new SavingsAccountTransactionTemplate();
    model.accountId = modelContainer.getIntegerValue("accountId");
    model.accountNo = modelContainer.getStringValue("accountNo");
    model.reversed = modelContainer.getBooleanValue("reversed");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<SavingsAccountTransactionTemplate, ?> modelContainer) {
    int indexaccountId = cursor.getColumnIndex("accountId");
    if (indexaccountId != -1 && !cursor.isNull(indexaccountId)) {
      modelContainer.put("accountId", cursor.getInt(indexaccountId));
    } else {
      modelContainer.putDefault("accountId");
    }
    int indexaccountNo = cursor.getColumnIndex("accountNo");
    if (indexaccountNo != -1 && !cursor.isNull(indexaccountNo)) {
      modelContainer.put("accountNo", cursor.getString(indexaccountNo));
    } else {
      modelContainer.putDefault("accountNo");
    }
    int indexreversed = cursor.getColumnIndex("reversed");
    if (indexreversed != -1 && !cursor.isNull(indexreversed)) {
      modelContainer.put("reversed", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexreversed)));
    } else {
      modelContainer.putDefault("reversed");
    }
  }

  @Override
  public final ForeignKeyContainer<SavingsAccountTransactionTemplate> toForeignKeyContainer(SavingsAccountTransactionTemplate model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(SavingsAccountTransactionTemplate.class);
    modelContainer.put(SavingsAccountTransactionTemplate_Table.accountId, model.accountId);
    return modelContainer;
  }
}
