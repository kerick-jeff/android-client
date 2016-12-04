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

public final class Status_Adapter extends ModelAdapter<Status> {
  public Status_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Status> getModelClass() {
    return Status.class;
  }

  public final String getTableName() {
    return "`SavingsAccountStatus`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Status_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Status model) {
    if (model.id != null) {
      values.put(Status_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(Status_Table.id.getCursorKey());
    }
    if (model.code != null) {
      values.put(Status_Table.code.getCursorKey(), model.code);
    } else {
      values.putNull(Status_Table.code.getCursorKey());
    }
    if (model.value != null) {
      values.put(Status_Table.value.getCursorKey(), model.value);
    } else {
      values.putNull(Status_Table.value.getCursorKey());
    }
    Integer refsubmittedAndPendingApproval = model.submittedAndPendingApproval != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.submittedAndPendingApproval) : null;
    if (refsubmittedAndPendingApproval != null) {
      values.put(Status_Table.submittedAndPendingApproval.getCursorKey(), refsubmittedAndPendingApproval);
    } else {
      values.putNull(Status_Table.submittedAndPendingApproval.getCursorKey());
    }
    Integer refapproved = model.approved != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.approved) : null;
    if (refapproved != null) {
      values.put(Status_Table.approved.getCursorKey(), refapproved);
    } else {
      values.putNull(Status_Table.approved.getCursorKey());
    }
    Integer refrejected = model.rejected != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.rejected) : null;
    if (refrejected != null) {
      values.put(Status_Table.rejected.getCursorKey(), refrejected);
    } else {
      values.putNull(Status_Table.rejected.getCursorKey());
    }
    Integer refwithdrawnByApplicant = model.withdrawnByApplicant != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.withdrawnByApplicant) : null;
    if (refwithdrawnByApplicant != null) {
      values.put(Status_Table.withdrawnByApplicant.getCursorKey(), refwithdrawnByApplicant);
    } else {
      values.putNull(Status_Table.withdrawnByApplicant.getCursorKey());
    }
    Integer refactive = model.active != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.active) : null;
    if (refactive != null) {
      values.put(Status_Table.active.getCursorKey(), refactive);
    } else {
      values.putNull(Status_Table.active.getCursorKey());
    }
    Integer refclosed = model.closed != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.closed) : null;
    if (refclosed != null) {
      values.put(Status_Table.closed.getCursorKey(), refclosed);
    } else {
      values.putNull(Status_Table.closed.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Status model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Status model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.code != null) {
      statement.bindString(2 + start, model.code);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.value != null) {
      statement.bindString(3 + start, model.value);
    } else {
      statement.bindNull(3 + start);
    }
    Integer refsubmittedAndPendingApproval = model.submittedAndPendingApproval != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.submittedAndPendingApproval) : null;
    if (refsubmittedAndPendingApproval != null) {
      statement.bindLong(4 + start, refsubmittedAndPendingApproval);
    } else {
      statement.bindNull(4 + start);
    }
    Integer refapproved = model.approved != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.approved) : null;
    if (refapproved != null) {
      statement.bindLong(5 + start, refapproved);
    } else {
      statement.bindNull(5 + start);
    }
    Integer refrejected = model.rejected != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.rejected) : null;
    if (refrejected != null) {
      statement.bindLong(6 + start, refrejected);
    } else {
      statement.bindNull(6 + start);
    }
    Integer refwithdrawnByApplicant = model.withdrawnByApplicant != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.withdrawnByApplicant) : null;
    if (refwithdrawnByApplicant != null) {
      statement.bindLong(7 + start, refwithdrawnByApplicant);
    } else {
      statement.bindNull(7 + start);
    }
    Integer refactive = model.active != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.active) : null;
    if (refactive != null) {
      statement.bindLong(8 + start, refactive);
    } else {
      statement.bindNull(8 + start);
    }
    Integer refclosed = model.closed != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.closed) : null;
    if (refclosed != null) {
      statement.bindLong(9 + start, refclosed);
    } else {
      statement.bindNull(9 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Status model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `SavingsAccountStatus`(`id`,`code`,`value`,`submittedAndPendingApproval`,`approved`,`rejected`,`withdrawnByApplicant`,`active`,`closed`) VALUES (?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `SavingsAccountStatus`(`id`,`code`,`value`,`submittedAndPendingApproval`,`approved`,`rejected`,`withdrawnByApplicant`,`active`,`closed`) VALUES (?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `SavingsAccountStatus`(`id` INTEGER,`code` TEXT,`value` TEXT,`submittedAndPendingApproval` INTEGER,`approved` INTEGER,`rejected` INTEGER,`withdrawnByApplicant` INTEGER,`active` INTEGER,`closed` INTEGER, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Status model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
    }
    int indexcode = cursor.getColumnIndex("code");
    if (indexcode != -1 && !cursor.isNull(indexcode)) {
      model.code = cursor.getString(indexcode);
    } else {
      model.code = null;
    }
    int indexvalue = cursor.getColumnIndex("value");
    if (indexvalue != -1 && !cursor.isNull(indexvalue)) {
      model.value = cursor.getString(indexvalue);
    } else {
      model.value = null;
    }
    int indexsubmittedAndPendingApproval = cursor.getColumnIndex("submittedAndPendingApproval");
    if (indexsubmittedAndPendingApproval != -1 && !cursor.isNull(indexsubmittedAndPendingApproval)) {
      model.submittedAndPendingApproval = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexsubmittedAndPendingApproval));
    } else {
      model.submittedAndPendingApproval = null;
    }
    int indexapproved = cursor.getColumnIndex("approved");
    if (indexapproved != -1 && !cursor.isNull(indexapproved)) {
      model.approved = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexapproved));
    } else {
      model.approved = null;
    }
    int indexrejected = cursor.getColumnIndex("rejected");
    if (indexrejected != -1 && !cursor.isNull(indexrejected)) {
      model.rejected = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexrejected));
    } else {
      model.rejected = null;
    }
    int indexwithdrawnByApplicant = cursor.getColumnIndex("withdrawnByApplicant");
    if (indexwithdrawnByApplicant != -1 && !cursor.isNull(indexwithdrawnByApplicant)) {
      model.withdrawnByApplicant = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexwithdrawnByApplicant));
    } else {
      model.withdrawnByApplicant = null;
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      model.active = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexactive));
    } else {
      model.active = null;
    }
    int indexclosed = cursor.getColumnIndex("closed");
    if (indexclosed != -1 && !cursor.isNull(indexclosed)) {
      model.closed = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexclosed));
    } else {
      model.closed = null;
    }
  }

  @Override
  public final boolean exists(Status model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Status.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Status model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Status_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Status newInstance() {
    return new Status();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Status_Table.getProperty(name);
  }
}
