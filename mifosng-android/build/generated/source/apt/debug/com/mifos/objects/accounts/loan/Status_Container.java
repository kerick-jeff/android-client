package com.mifos.objects.accounts.loan;

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
public final class Status_Container extends ModelContainerAdapter<Status> {
  public Status_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("code", String.class);
    columnMap.put("value", String.class);
    columnMap.put("pendingApproval", Boolean.class);
    columnMap.put("waitingForDisbursal", Boolean.class);
    columnMap.put("active", Boolean.class);
    columnMap.put("closedObligationsMet", Boolean.class);
    columnMap.put("closedWrittenOff", Boolean.class);
    columnMap.put("closedRescheduled", Boolean.class);
    columnMap.put("closed", Boolean.class);
    columnMap.put("overpaid", Boolean.class);
  }

  @Override
  public final Class<Status> getModelClass() {
    return Status.class;
  }

  public final String getTableName() {
    return "`LoanStatus`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Status, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(Status_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(Status_Table.id.getCursorKey());
    }
    String modelContainercode = modelContainer.getStringValue("code");
    if (modelContainercode != null) {
      values.put(Status_Table.code.getCursorKey(), modelContainercode);
    } else {
      values.putNull(Status_Table.code.getCursorKey());
    }
    String modelContainervalue = modelContainer.getStringValue("value");
    if (modelContainervalue != null) {
      values.put(Status_Table.value.getCursorKey(), modelContainervalue);
    } else {
      values.putNull(Status_Table.value.getCursorKey());
    }
    Integer modelContainerpendingApproval = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("pendingApproval"));
    if (modelContainerpendingApproval != null) {
      values.put(Status_Table.pendingApproval.getCursorKey(), modelContainerpendingApproval);
    } else {
      values.putNull(Status_Table.pendingApproval.getCursorKey());
    }
    Integer modelContainerwaitingForDisbursal = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("waitingForDisbursal"));
    if (modelContainerwaitingForDisbursal != null) {
      values.put(Status_Table.waitingForDisbursal.getCursorKey(), modelContainerwaitingForDisbursal);
    } else {
      values.putNull(Status_Table.waitingForDisbursal.getCursorKey());
    }
    Integer modelContaineractive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("active"));
    if (modelContaineractive != null) {
      values.put(Status_Table.active.getCursorKey(), modelContaineractive);
    } else {
      values.putNull(Status_Table.active.getCursorKey());
    }
    Integer modelContainerclosedObligationsMet = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("closedObligationsMet"));
    if (modelContainerclosedObligationsMet != null) {
      values.put(Status_Table.closedObligationsMet.getCursorKey(), modelContainerclosedObligationsMet);
    } else {
      values.putNull(Status_Table.closedObligationsMet.getCursorKey());
    }
    Integer modelContainerclosedWrittenOff = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("closedWrittenOff"));
    if (modelContainerclosedWrittenOff != null) {
      values.put(Status_Table.closedWrittenOff.getCursorKey(), modelContainerclosedWrittenOff);
    } else {
      values.putNull(Status_Table.closedWrittenOff.getCursorKey());
    }
    Integer modelContainerclosedRescheduled = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("closedRescheduled"));
    if (modelContainerclosedRescheduled != null) {
      values.put(Status_Table.closedRescheduled.getCursorKey(), modelContainerclosedRescheduled);
    } else {
      values.putNull(Status_Table.closedRescheduled.getCursorKey());
    }
    Integer modelContainerclosed = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("closed"));
    if (modelContainerclosed != null) {
      values.put(Status_Table.closed.getCursorKey(), modelContainerclosed);
    } else {
      values.putNull(Status_Table.closed.getCursorKey());
    }
    Integer modelContaineroverpaid = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("overpaid"));
    if (modelContaineroverpaid != null) {
      values.put(Status_Table.overpaid.getCursorKey(), modelContaineroverpaid);
    } else {
      values.putNull(Status_Table.overpaid.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Status, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Status, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContainercode = modelContainer.getStringValue("code");
    if (modelContainercode != null) {
      statement.bindString(2 + start, modelContainercode);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainervalue = modelContainer.getStringValue("value");
    if (modelContainervalue != null) {
      statement.bindString(3 + start, modelContainervalue);
    } else {
      statement.bindNull(3 + start);
    }
    Integer modelContainerpendingApproval = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("pendingApproval"));
    if (modelContainerpendingApproval != null) {
      statement.bindLong(4 + start, modelContainerpendingApproval);
    } else {
      statement.bindNull(4 + start);
    }
    Integer modelContainerwaitingForDisbursal = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("waitingForDisbursal"));
    if (modelContainerwaitingForDisbursal != null) {
      statement.bindLong(5 + start, modelContainerwaitingForDisbursal);
    } else {
      statement.bindNull(5 + start);
    }
    Integer modelContaineractive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("active"));
    if (modelContaineractive != null) {
      statement.bindLong(6 + start, modelContaineractive);
    } else {
      statement.bindNull(6 + start);
    }
    Integer modelContainerclosedObligationsMet = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("closedObligationsMet"));
    if (modelContainerclosedObligationsMet != null) {
      statement.bindLong(7 + start, modelContainerclosedObligationsMet);
    } else {
      statement.bindNull(7 + start);
    }
    Integer modelContainerclosedWrittenOff = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("closedWrittenOff"));
    if (modelContainerclosedWrittenOff != null) {
      statement.bindLong(8 + start, modelContainerclosedWrittenOff);
    } else {
      statement.bindNull(8 + start);
    }
    Integer modelContainerclosedRescheduled = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("closedRescheduled"));
    if (modelContainerclosedRescheduled != null) {
      statement.bindLong(9 + start, modelContainerclosedRescheduled);
    } else {
      statement.bindNull(9 + start);
    }
    Integer modelContainerclosed = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("closed"));
    if (modelContainerclosed != null) {
      statement.bindLong(10 + start, modelContainerclosed);
    } else {
      statement.bindNull(10 + start);
    }
    Integer modelContaineroverpaid = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("overpaid"));
    if (modelContaineroverpaid != null) {
      statement.bindLong(11 + start, modelContaineroverpaid);
    } else {
      statement.bindNull(11 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Status, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Status, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Status.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Status, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Status_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final Status toModel(ModelContainer<Status, ?> modelContainer) {
    Status model = new Status();
    model.id = modelContainer.getIntegerValue("id");
    model.code = modelContainer.getStringValue("code");
    model.value = modelContainer.getStringValue("value");
    model.pendingApproval = modelContainer.getBooleanValue("pendingApproval");
    model.waitingForDisbursal = modelContainer.getBooleanValue("waitingForDisbursal");
    model.active = modelContainer.getBooleanValue("active");
    model.closedObligationsMet = modelContainer.getBooleanValue("closedObligationsMet");
    model.closedWrittenOff = modelContainer.getBooleanValue("closedWrittenOff");
    model.closedRescheduled = modelContainer.getBooleanValue("closedRescheduled");
    model.closed = modelContainer.getBooleanValue("closed");
    model.overpaid = modelContainer.getBooleanValue("overpaid");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Status, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexcode = cursor.getColumnIndex("code");
    if (indexcode != -1 && !cursor.isNull(indexcode)) {
      modelContainer.put("code", cursor.getString(indexcode));
    } else {
      modelContainer.putDefault("code");
    }
    int indexvalue = cursor.getColumnIndex("value");
    if (indexvalue != -1 && !cursor.isNull(indexvalue)) {
      modelContainer.put("value", cursor.getString(indexvalue));
    } else {
      modelContainer.putDefault("value");
    }
    int indexpendingApproval = cursor.getColumnIndex("pendingApproval");
    if (indexpendingApproval != -1 && !cursor.isNull(indexpendingApproval)) {
      modelContainer.put("pendingApproval", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexpendingApproval)));
    } else {
      modelContainer.putDefault("pendingApproval");
    }
    int indexwaitingForDisbursal = cursor.getColumnIndex("waitingForDisbursal");
    if (indexwaitingForDisbursal != -1 && !cursor.isNull(indexwaitingForDisbursal)) {
      modelContainer.put("waitingForDisbursal", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexwaitingForDisbursal)));
    } else {
      modelContainer.putDefault("waitingForDisbursal");
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      modelContainer.put("active", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexactive)));
    } else {
      modelContainer.putDefault("active");
    }
    int indexclosedObligationsMet = cursor.getColumnIndex("closedObligationsMet");
    if (indexclosedObligationsMet != -1 && !cursor.isNull(indexclosedObligationsMet)) {
      modelContainer.put("closedObligationsMet", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexclosedObligationsMet)));
    } else {
      modelContainer.putDefault("closedObligationsMet");
    }
    int indexclosedWrittenOff = cursor.getColumnIndex("closedWrittenOff");
    if (indexclosedWrittenOff != -1 && !cursor.isNull(indexclosedWrittenOff)) {
      modelContainer.put("closedWrittenOff", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexclosedWrittenOff)));
    } else {
      modelContainer.putDefault("closedWrittenOff");
    }
    int indexclosedRescheduled = cursor.getColumnIndex("closedRescheduled");
    if (indexclosedRescheduled != -1 && !cursor.isNull(indexclosedRescheduled)) {
      modelContainer.put("closedRescheduled", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexclosedRescheduled)));
    } else {
      modelContainer.putDefault("closedRescheduled");
    }
    int indexclosed = cursor.getColumnIndex("closed");
    if (indexclosed != -1 && !cursor.isNull(indexclosed)) {
      modelContainer.put("closed", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexclosed)));
    } else {
      modelContainer.putDefault("closed");
    }
    int indexoverpaid = cursor.getColumnIndex("overpaid");
    if (indexoverpaid != -1 && !cursor.isNull(indexoverpaid)) {
      modelContainer.put("overpaid", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexoverpaid)));
    } else {
      modelContainer.putDefault("overpaid");
    }
  }

  @Override
  public final ForeignKeyContainer<Status> toForeignKeyContainer(Status model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Status.class);
    modelContainer.put(Status_Table.id, model.id);
    return modelContainer;
  }
}
