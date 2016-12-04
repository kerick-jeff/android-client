package com.mifos.objects;

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
public final class PaymentTypeOption_Container extends ModelContainerAdapter<PaymentTypeOption> {
  public PaymentTypeOption_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("name", String.class);
    columnMap.put("description", String.class);
    columnMap.put("isCashPayment", Boolean.class);
    columnMap.put("position", Integer.class);
  }

  @Override
  public final Class<PaymentTypeOption> getModelClass() {
    return PaymentTypeOption.class;
  }

  public final String getTableName() {
    return "`PaymentTypeOption`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<PaymentTypeOption, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(PaymentTypeOption_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(PaymentTypeOption_Table.id.getCursorKey());
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      values.put(PaymentTypeOption_Table.name.getCursorKey(), modelContainername);
    } else {
      values.putNull(PaymentTypeOption_Table.name.getCursorKey());
    }
    String modelContainerdescription = modelContainer.getStringValue("description");
    if (modelContainerdescription != null) {
      values.put(PaymentTypeOption_Table.description.getCursorKey(), modelContainerdescription);
    } else {
      values.putNull(PaymentTypeOption_Table.description.getCursorKey());
    }
    Integer modelContainerisCashPayment = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isCashPayment"));
    if (modelContainerisCashPayment != null) {
      values.put(PaymentTypeOption_Table.isCashPayment.getCursorKey(), modelContainerisCashPayment);
    } else {
      values.putNull(PaymentTypeOption_Table.isCashPayment.getCursorKey());
    }
    Integer modelContainerposition = modelContainer.getIntegerValue("position");
    if (modelContainerposition != null) {
      values.put(PaymentTypeOption_Table.position.getCursorKey(), modelContainerposition);
    } else {
      values.putNull(PaymentTypeOption_Table.position.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<PaymentTypeOption, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<PaymentTypeOption, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      statement.bindString(2 + start, modelContainername);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainerdescription = modelContainer.getStringValue("description");
    if (modelContainerdescription != null) {
      statement.bindString(3 + start, modelContainerdescription);
    } else {
      statement.bindNull(3 + start);
    }
    Integer modelContainerisCashPayment = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isCashPayment"));
    if (modelContainerisCashPayment != null) {
      statement.bindLong(4 + start, modelContainerisCashPayment);
    } else {
      statement.bindNull(4 + start);
    }
    Integer modelContainerposition = modelContainer.getIntegerValue("position");
    if (modelContainerposition != null) {
      statement.bindLong(5 + start, modelContainerposition);
    } else {
      statement.bindNull(5 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<PaymentTypeOption, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<PaymentTypeOption, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(PaymentTypeOption.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<PaymentTypeOption, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(PaymentTypeOption_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final PaymentTypeOption toModel(ModelContainer<PaymentTypeOption, ?> modelContainer) {
    PaymentTypeOption model = new PaymentTypeOption();
    model.id = modelContainer.getIntegerValue("id");
    model.name = modelContainer.getStringValue("name");
    model.description = modelContainer.getStringValue("description");
    model.isCashPayment = modelContainer.getBooleanValue("isCashPayment");
    model.position = modelContainer.getIntegerValue("position");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<PaymentTypeOption, ?> modelContainer) {
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
    int indexdescription = cursor.getColumnIndex("description");
    if (indexdescription != -1 && !cursor.isNull(indexdescription)) {
      modelContainer.put("description", cursor.getString(indexdescription));
    } else {
      modelContainer.putDefault("description");
    }
    int indexisCashPayment = cursor.getColumnIndex("isCashPayment");
    if (indexisCashPayment != -1 && !cursor.isNull(indexisCashPayment)) {
      modelContainer.put("isCashPayment", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisCashPayment)));
    } else {
      modelContainer.putDefault("isCashPayment");
    }
    int indexposition = cursor.getColumnIndex("position");
    if (indexposition != -1 && !cursor.isNull(indexposition)) {
      modelContainer.put("position", cursor.getInt(indexposition));
    } else {
      modelContainer.putDefault("position");
    }
  }

  @Override
  public final ForeignKeyContainer<PaymentTypeOption> toForeignKeyContainer(PaymentTypeOption model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(PaymentTypeOption.class);
    modelContainer.put(PaymentTypeOption_Table.id, model.id);
    return modelContainer;
  }
}
