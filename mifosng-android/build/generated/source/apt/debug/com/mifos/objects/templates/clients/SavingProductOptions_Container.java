package com.mifos.objects.templates.clients;

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
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class SavingProductOptions_Container extends ModelContainerAdapter<SavingProductOptions> {
  public SavingProductOptions_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", int.class);
    columnMap.put("name", String.class);
    columnMap.put("withdrawalFeeForTransfers", boolean.class);
    columnMap.put("allowOverdraft", boolean.class);
  }

  @Override
  public final Class<SavingProductOptions> getModelClass() {
    return SavingProductOptions.class;
  }

  public final String getTableName() {
    return "`ClientTemplateSavingProductsOptions`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<SavingProductOptions, ?> modelContainer) {
    values.put(SavingProductOptions_Table.id.getCursorKey(), modelContainer.getIntValue("id"));
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      values.put(SavingProductOptions_Table.name.getCursorKey(), modelContainername);
    } else {
      values.putNull(SavingProductOptions_Table.name.getCursorKey());
    }
    values.put(SavingProductOptions_Table.withdrawalFeeForTransfers.getCursorKey(), modelContainer.getBoolValue("withdrawalFeeForTransfers"));
    values.put(SavingProductOptions_Table.allowOverdraft.getCursorKey(), modelContainer.getBoolValue("allowOverdraft"));
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<SavingProductOptions, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<SavingProductOptions, ?> modelContainer, int start) {
    statement.bindLong(1 + start, modelContainer.getIntValue("id"));
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      statement.bindString(2 + start, modelContainername);
    } else {
      statement.bindNull(2 + start);
    }
    statement.bindLong(3 + start, modelContainer.getBoolValue("withdrawalFeeForTransfers") ? 1 : 0);
    statement.bindLong(4 + start, modelContainer.getBoolValue("allowOverdraft") ? 1 : 0);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<SavingProductOptions, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<SavingProductOptions, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingProductOptions.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<SavingProductOptions, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingProductOptions_Table.id.eq(modelContainer.getIntValue("id")));return clause;
  }

  @Override
  public final SavingProductOptions toModel(ModelContainer<SavingProductOptions, ?> modelContainer) {
    SavingProductOptions model = new SavingProductOptions();
    model.id = modelContainer.getIntValue("id");
    model.name = modelContainer.getStringValue("name");
    model.withdrawalFeeForTransfers = modelContainer.getBoolValue("withdrawalFeeForTransfers");
    model.allowOverdraft = modelContainer.getBoolValue("allowOverdraft");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<SavingProductOptions, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      modelContainer.put("name", cursor.getString(indexname));
    } else {
      modelContainer.putDefault("name");
    }
    int indexwithdrawalFeeForTransfers = cursor.getColumnIndex("withdrawalFeeForTransfers");
    if (indexwithdrawalFeeForTransfers != -1 && !cursor.isNull(indexwithdrawalFeeForTransfers)) {
      modelContainer.put("withdrawalFeeForTransfers", cursor.getInt(indexwithdrawalFeeForTransfers));
    } else {
      modelContainer.putDefault("withdrawalFeeForTransfers");
    }
    int indexallowOverdraft = cursor.getColumnIndex("allowOverdraft");
    if (indexallowOverdraft != -1 && !cursor.isNull(indexallowOverdraft)) {
      modelContainer.put("allowOverdraft", cursor.getInt(indexallowOverdraft));
    } else {
      modelContainer.putDefault("allowOverdraft");
    }
  }

  @Override
  public final ForeignKeyContainer<SavingProductOptions> toForeignKeyContainer(SavingProductOptions model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(SavingProductOptions.class);
    modelContainer.put(SavingProductOptions_Table.id, model.id);
    return modelContainer;
  }
}
