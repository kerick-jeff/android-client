package com.mifos.objects.accounts.loan;

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
    return "`LoanStatus`";
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
    Integer refpendingApproval = model.pendingApproval != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.pendingApproval) : null;
    if (refpendingApproval != null) {
      values.put(Status_Table.pendingApproval.getCursorKey(), refpendingApproval);
    } else {
      values.putNull(Status_Table.pendingApproval.getCursorKey());
    }
    Integer refwaitingForDisbursal = model.waitingForDisbursal != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.waitingForDisbursal) : null;
    if (refwaitingForDisbursal != null) {
      values.put(Status_Table.waitingForDisbursal.getCursorKey(), refwaitingForDisbursal);
    } else {
      values.putNull(Status_Table.waitingForDisbursal.getCursorKey());
    }
    Integer refactive = model.active != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.active) : null;
    if (refactive != null) {
      values.put(Status_Table.active.getCursorKey(), refactive);
    } else {
      values.putNull(Status_Table.active.getCursorKey());
    }
    Integer refclosedObligationsMet = model.closedObligationsMet != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.closedObligationsMet) : null;
    if (refclosedObligationsMet != null) {
      values.put(Status_Table.closedObligationsMet.getCursorKey(), refclosedObligationsMet);
    } else {
      values.putNull(Status_Table.closedObligationsMet.getCursorKey());
    }
    Integer refclosedWrittenOff = model.closedWrittenOff != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.closedWrittenOff) : null;
    if (refclosedWrittenOff != null) {
      values.put(Status_Table.closedWrittenOff.getCursorKey(), refclosedWrittenOff);
    } else {
      values.putNull(Status_Table.closedWrittenOff.getCursorKey());
    }
    Integer refclosedRescheduled = model.closedRescheduled != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.closedRescheduled) : null;
    if (refclosedRescheduled != null) {
      values.put(Status_Table.closedRescheduled.getCursorKey(), refclosedRescheduled);
    } else {
      values.putNull(Status_Table.closedRescheduled.getCursorKey());
    }
    Integer refclosed = model.closed != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.closed) : null;
    if (refclosed != null) {
      values.put(Status_Table.closed.getCursorKey(), refclosed);
    } else {
      values.putNull(Status_Table.closed.getCursorKey());
    }
    Integer refoverpaid = model.overpaid != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.overpaid) : null;
    if (refoverpaid != null) {
      values.put(Status_Table.overpaid.getCursorKey(), refoverpaid);
    } else {
      values.putNull(Status_Table.overpaid.getCursorKey());
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
    Integer refpendingApproval = model.pendingApproval != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.pendingApproval) : null;
    if (refpendingApproval != null) {
      statement.bindLong(4 + start, refpendingApproval);
    } else {
      statement.bindNull(4 + start);
    }
    Integer refwaitingForDisbursal = model.waitingForDisbursal != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.waitingForDisbursal) : null;
    if (refwaitingForDisbursal != null) {
      statement.bindLong(5 + start, refwaitingForDisbursal);
    } else {
      statement.bindNull(5 + start);
    }
    Integer refactive = model.active != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.active) : null;
    if (refactive != null) {
      statement.bindLong(6 + start, refactive);
    } else {
      statement.bindNull(6 + start);
    }
    Integer refclosedObligationsMet = model.closedObligationsMet != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.closedObligationsMet) : null;
    if (refclosedObligationsMet != null) {
      statement.bindLong(7 + start, refclosedObligationsMet);
    } else {
      statement.bindNull(7 + start);
    }
    Integer refclosedWrittenOff = model.closedWrittenOff != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.closedWrittenOff) : null;
    if (refclosedWrittenOff != null) {
      statement.bindLong(8 + start, refclosedWrittenOff);
    } else {
      statement.bindNull(8 + start);
    }
    Integer refclosedRescheduled = model.closedRescheduled != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.closedRescheduled) : null;
    if (refclosedRescheduled != null) {
      statement.bindLong(9 + start, refclosedRescheduled);
    } else {
      statement.bindNull(9 + start);
    }
    Integer refclosed = model.closed != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.closed) : null;
    if (refclosed != null) {
      statement.bindLong(10 + start, refclosed);
    } else {
      statement.bindNull(10 + start);
    }
    Integer refoverpaid = model.overpaid != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.overpaid) : null;
    if (refoverpaid != null) {
      statement.bindLong(11 + start, refoverpaid);
    } else {
      statement.bindNull(11 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Status model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `LoanStatus`(`id`,`code`,`value`,`pendingApproval`,`waitingForDisbursal`,`active`,`closedObligationsMet`,`closedWrittenOff`,`closedRescheduled`,`closed`,`overpaid`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `LoanStatus`(`id`,`code`,`value`,`pendingApproval`,`waitingForDisbursal`,`active`,`closedObligationsMet`,`closedWrittenOff`,`closedRescheduled`,`closed`,`overpaid`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `LoanStatus`(`id` INTEGER,`code` TEXT,`value` TEXT,`pendingApproval` INTEGER,`waitingForDisbursal` INTEGER,`active` INTEGER,`closedObligationsMet` INTEGER,`closedWrittenOff` INTEGER,`closedRescheduled` INTEGER,`closed` INTEGER,`overpaid` INTEGER, PRIMARY KEY(`id`)" + ");";
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
    int indexpendingApproval = cursor.getColumnIndex("pendingApproval");
    if (indexpendingApproval != -1 && !cursor.isNull(indexpendingApproval)) {
      model.pendingApproval = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexpendingApproval));
    } else {
      model.pendingApproval = null;
    }
    int indexwaitingForDisbursal = cursor.getColumnIndex("waitingForDisbursal");
    if (indexwaitingForDisbursal != -1 && !cursor.isNull(indexwaitingForDisbursal)) {
      model.waitingForDisbursal = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexwaitingForDisbursal));
    } else {
      model.waitingForDisbursal = null;
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      model.active = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexactive));
    } else {
      model.active = null;
    }
    int indexclosedObligationsMet = cursor.getColumnIndex("closedObligationsMet");
    if (indexclosedObligationsMet != -1 && !cursor.isNull(indexclosedObligationsMet)) {
      model.closedObligationsMet = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexclosedObligationsMet));
    } else {
      model.closedObligationsMet = null;
    }
    int indexclosedWrittenOff = cursor.getColumnIndex("closedWrittenOff");
    if (indexclosedWrittenOff != -1 && !cursor.isNull(indexclosedWrittenOff)) {
      model.closedWrittenOff = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexclosedWrittenOff));
    } else {
      model.closedWrittenOff = null;
    }
    int indexclosedRescheduled = cursor.getColumnIndex("closedRescheduled");
    if (indexclosedRescheduled != -1 && !cursor.isNull(indexclosedRescheduled)) {
      model.closedRescheduled = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexclosedRescheduled));
    } else {
      model.closedRescheduled = null;
    }
    int indexclosed = cursor.getColumnIndex("closed");
    if (indexclosed != -1 && !cursor.isNull(indexclosed)) {
      model.closed = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexclosed));
    } else {
      model.closed = null;
    }
    int indexoverpaid = cursor.getColumnIndex("overpaid");
    if (indexoverpaid != -1 && !cursor.isNull(indexoverpaid)) {
      model.overpaid = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexoverpaid));
    } else {
      model.overpaid = null;
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
