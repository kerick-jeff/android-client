package com.mifos.objects.organisation;

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

public final class Staff_Adapter extends ModelAdapter<Staff> {
  public Staff_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Staff> getModelClass() {
    return Staff.class;
  }

  public final String getTableName() {
    return "`Staff`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Staff_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Staff model) {
    if (model.id != null) {
      values.put(Staff_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(Staff_Table.id.getCursorKey());
    }
    if (model.firstname != null) {
      values.put(Staff_Table.firstname.getCursorKey(), model.firstname);
    } else {
      values.putNull(Staff_Table.firstname.getCursorKey());
    }
    if (model.lastname != null) {
      values.put(Staff_Table.lastname.getCursorKey(), model.lastname);
    } else {
      values.putNull(Staff_Table.lastname.getCursorKey());
    }
    if (model.mobileNo != null) {
      values.put(Staff_Table.mobileNo.getCursorKey(), model.mobileNo);
    } else {
      values.putNull(Staff_Table.mobileNo.getCursorKey());
    }
    if (model.displayName != null) {
      values.put(Staff_Table.displayName.getCursorKey(), model.displayName);
    } else {
      values.putNull(Staff_Table.displayName.getCursorKey());
    }
    if (model.officeId != null) {
      values.put(Staff_Table.officeId.getCursorKey(), model.officeId);
    } else {
      values.putNull(Staff_Table.officeId.getCursorKey());
    }
    if (model.officeName != null) {
      values.put(Staff_Table.officeName.getCursorKey(), model.officeName);
    } else {
      values.putNull(Staff_Table.officeName.getCursorKey());
    }
    Integer refisLoanOfficer = model.isLoanOfficer != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isLoanOfficer) : null;
    if (refisLoanOfficer != null) {
      values.put(Staff_Table.isLoanOfficer.getCursorKey(), refisLoanOfficer);
    } else {
      values.putNull(Staff_Table.isLoanOfficer.getCursorKey());
    }
    Integer refisActive = model.isActive != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isActive) : null;
    if (refisActive != null) {
      values.put(Staff_Table.isActive.getCursorKey(), refisActive);
    } else {
      values.putNull(Staff_Table.isActive.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Staff model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Staff model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.firstname != null) {
      statement.bindString(2 + start, model.firstname);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.lastname != null) {
      statement.bindString(3 + start, model.lastname);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.mobileNo != null) {
      statement.bindString(4 + start, model.mobileNo);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.displayName != null) {
      statement.bindString(5 + start, model.displayName);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.officeId != null) {
      statement.bindLong(6 + start, model.officeId);
    } else {
      statement.bindNull(6 + start);
    }
    if (model.officeName != null) {
      statement.bindString(7 + start, model.officeName);
    } else {
      statement.bindNull(7 + start);
    }
    Integer refisLoanOfficer = model.isLoanOfficer != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isLoanOfficer) : null;
    if (refisLoanOfficer != null) {
      statement.bindLong(8 + start, refisLoanOfficer);
    } else {
      statement.bindNull(8 + start);
    }
    Integer refisActive = model.isActive != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isActive) : null;
    if (refisActive != null) {
      statement.bindLong(9 + start, refisActive);
    } else {
      statement.bindNull(9 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Staff model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Staff`(`id`,`firstname`,`lastname`,`mobileNo`,`displayName`,`officeId`,`officeName`,`isLoanOfficer`,`isActive`) VALUES (?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Staff`(`id`,`firstname`,`lastname`,`mobileNo`,`displayName`,`officeId`,`officeName`,`isLoanOfficer`,`isActive`) VALUES (?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Staff`(`id` INTEGER,`firstname` TEXT,`lastname` TEXT,`mobileNo` TEXT,`displayName` TEXT,`officeId` INTEGER,`officeName` TEXT,`isLoanOfficer` INTEGER,`isActive` INTEGER, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Staff model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
    }
    int indexfirstname = cursor.getColumnIndex("firstname");
    if (indexfirstname != -1 && !cursor.isNull(indexfirstname)) {
      model.firstname = cursor.getString(indexfirstname);
    } else {
      model.firstname = null;
    }
    int indexlastname = cursor.getColumnIndex("lastname");
    if (indexlastname != -1 && !cursor.isNull(indexlastname)) {
      model.lastname = cursor.getString(indexlastname);
    } else {
      model.lastname = null;
    }
    int indexmobileNo = cursor.getColumnIndex("mobileNo");
    if (indexmobileNo != -1 && !cursor.isNull(indexmobileNo)) {
      model.mobileNo = cursor.getString(indexmobileNo);
    } else {
      model.mobileNo = null;
    }
    int indexdisplayName = cursor.getColumnIndex("displayName");
    if (indexdisplayName != -1 && !cursor.isNull(indexdisplayName)) {
      model.displayName = cursor.getString(indexdisplayName);
    } else {
      model.displayName = null;
    }
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      model.officeId = cursor.getInt(indexofficeId);
    } else {
      model.officeId = null;
    }
    int indexofficeName = cursor.getColumnIndex("officeName");
    if (indexofficeName != -1 && !cursor.isNull(indexofficeName)) {
      model.officeName = cursor.getString(indexofficeName);
    } else {
      model.officeName = null;
    }
    int indexisLoanOfficer = cursor.getColumnIndex("isLoanOfficer");
    if (indexisLoanOfficer != -1 && !cursor.isNull(indexisLoanOfficer)) {
      model.isLoanOfficer = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisLoanOfficer));
    } else {
      model.isLoanOfficer = null;
    }
    int indexisActive = cursor.getColumnIndex("isActive");
    if (indexisActive != -1 && !cursor.isNull(indexisActive)) {
      model.isActive = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisActive));
    } else {
      model.isActive = null;
    }
  }

  @Override
  public final boolean exists(Staff model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Staff.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Staff model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Staff_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Staff newInstance() {
    return new Staff();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Staff_Table.getProperty(name);
  }
}
