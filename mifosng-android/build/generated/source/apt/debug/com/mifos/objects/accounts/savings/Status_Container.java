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
public final class Status_Container extends ModelContainerAdapter<Status> {
  public Status_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("code", String.class);
    columnMap.put("value", String.class);
    columnMap.put("submittedAndPendingApproval", Boolean.class);
    columnMap.put("approved", Boolean.class);
    columnMap.put("rejected", Boolean.class);
    columnMap.put("withdrawnByApplicant", Boolean.class);
    columnMap.put("active", Boolean.class);
    columnMap.put("closed", Boolean.class);
  }

  @Override
  public final Class<Status> getModelClass() {
    return Status.class;
  }

  public final String getTableName() {
    return "`SavingsAccountStatus`";
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
    Integer modelContainersubmittedAndPendingApproval = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("submittedAndPendingApproval"));
    if (modelContainersubmittedAndPendingApproval != null) {
      values.put(Status_Table.submittedAndPendingApproval.getCursorKey(), modelContainersubmittedAndPendingApproval);
    } else {
      values.putNull(Status_Table.submittedAndPendingApproval.getCursorKey());
    }
    Integer modelContainerapproved = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("approved"));
    if (modelContainerapproved != null) {
      values.put(Status_Table.approved.getCursorKey(), modelContainerapproved);
    } else {
      values.putNull(Status_Table.approved.getCursorKey());
    }
    Integer modelContainerrejected = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("rejected"));
    if (modelContainerrejected != null) {
      values.put(Status_Table.rejected.getCursorKey(), modelContainerrejected);
    } else {
      values.putNull(Status_Table.rejected.getCursorKey());
    }
    Integer modelContainerwithdrawnByApplicant = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("withdrawnByApplicant"));
    if (modelContainerwithdrawnByApplicant != null) {
      values.put(Status_Table.withdrawnByApplicant.getCursorKey(), modelContainerwithdrawnByApplicant);
    } else {
      values.putNull(Status_Table.withdrawnByApplicant.getCursorKey());
    }
    Integer modelContaineractive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("active"));
    if (modelContaineractive != null) {
      values.put(Status_Table.active.getCursorKey(), modelContaineractive);
    } else {
      values.putNull(Status_Table.active.getCursorKey());
    }
    Integer modelContainerclosed = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("closed"));
    if (modelContainerclosed != null) {
      values.put(Status_Table.closed.getCursorKey(), modelContainerclosed);
    } else {
      values.putNull(Status_Table.closed.getCursorKey());
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
    Integer modelContainersubmittedAndPendingApproval = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("submittedAndPendingApproval"));
    if (modelContainersubmittedAndPendingApproval != null) {
      statement.bindLong(4 + start, modelContainersubmittedAndPendingApproval);
    } else {
      statement.bindNull(4 + start);
    }
    Integer modelContainerapproved = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("approved"));
    if (modelContainerapproved != null) {
      statement.bindLong(5 + start, modelContainerapproved);
    } else {
      statement.bindNull(5 + start);
    }
    Integer modelContainerrejected = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("rejected"));
    if (modelContainerrejected != null) {
      statement.bindLong(6 + start, modelContainerrejected);
    } else {
      statement.bindNull(6 + start);
    }
    Integer modelContainerwithdrawnByApplicant = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("withdrawnByApplicant"));
    if (modelContainerwithdrawnByApplicant != null) {
      statement.bindLong(7 + start, modelContainerwithdrawnByApplicant);
    } else {
      statement.bindNull(7 + start);
    }
    Integer modelContaineractive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("active"));
    if (modelContaineractive != null) {
      statement.bindLong(8 + start, modelContaineractive);
    } else {
      statement.bindNull(8 + start);
    }
    Integer modelContainerclosed = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("closed"));
    if (modelContainerclosed != null) {
      statement.bindLong(9 + start, modelContainerclosed);
    } else {
      statement.bindNull(9 + start);
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
    model.submittedAndPendingApproval = modelContainer.getBooleanValue("submittedAndPendingApproval");
    model.approved = modelContainer.getBooleanValue("approved");
    model.rejected = modelContainer.getBooleanValue("rejected");
    model.withdrawnByApplicant = modelContainer.getBooleanValue("withdrawnByApplicant");
    model.active = modelContainer.getBooleanValue("active");
    model.closed = modelContainer.getBooleanValue("closed");
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
    int indexsubmittedAndPendingApproval = cursor.getColumnIndex("submittedAndPendingApproval");
    if (indexsubmittedAndPendingApproval != -1 && !cursor.isNull(indexsubmittedAndPendingApproval)) {
      modelContainer.put("submittedAndPendingApproval", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexsubmittedAndPendingApproval)));
    } else {
      modelContainer.putDefault("submittedAndPendingApproval");
    }
    int indexapproved = cursor.getColumnIndex("approved");
    if (indexapproved != -1 && !cursor.isNull(indexapproved)) {
      modelContainer.put("approved", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexapproved)));
    } else {
      modelContainer.putDefault("approved");
    }
    int indexrejected = cursor.getColumnIndex("rejected");
    if (indexrejected != -1 && !cursor.isNull(indexrejected)) {
      modelContainer.put("rejected", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexrejected)));
    } else {
      modelContainer.putDefault("rejected");
    }
    int indexwithdrawnByApplicant = cursor.getColumnIndex("withdrawnByApplicant");
    if (indexwithdrawnByApplicant != -1 && !cursor.isNull(indexwithdrawnByApplicant)) {
      modelContainer.put("withdrawnByApplicant", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexwithdrawnByApplicant)));
    } else {
      modelContainer.putDefault("withdrawnByApplicant");
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      modelContainer.put("active", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexactive)));
    } else {
      modelContainer.putDefault("active");
    }
    int indexclosed = cursor.getColumnIndex("closed");
    if (indexclosed != -1 && !cursor.isNull(indexclosed)) {
      modelContainer.put("closed", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexclosed)));
    } else {
      modelContainer.putDefault("closed");
    }
  }

  @Override
  public final ForeignKeyContainer<Status> toForeignKeyContainer(Status model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Status.class);
    modelContainer.put(Status_Table.id, model.id);
    return modelContainer;
  }
}
