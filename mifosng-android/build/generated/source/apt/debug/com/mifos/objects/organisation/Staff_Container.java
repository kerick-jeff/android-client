package com.mifos.objects.organisation;

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
public final class Staff_Container extends ModelContainerAdapter<Staff> {
  public Staff_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("firstname", String.class);
    columnMap.put("lastname", String.class);
    columnMap.put("mobileNo", String.class);
    columnMap.put("displayName", String.class);
    columnMap.put("officeId", Integer.class);
    columnMap.put("officeName", String.class);
    columnMap.put("isLoanOfficer", Boolean.class);
    columnMap.put("isActive", Boolean.class);
  }

  @Override
  public final Class<Staff> getModelClass() {
    return Staff.class;
  }

  public final String getTableName() {
    return "`Staff`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Staff, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(Staff_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(Staff_Table.id.getCursorKey());
    }
    String modelContainerfirstname = modelContainer.getStringValue("firstname");
    if (modelContainerfirstname != null) {
      values.put(Staff_Table.firstname.getCursorKey(), modelContainerfirstname);
    } else {
      values.putNull(Staff_Table.firstname.getCursorKey());
    }
    String modelContainerlastname = modelContainer.getStringValue("lastname");
    if (modelContainerlastname != null) {
      values.put(Staff_Table.lastname.getCursorKey(), modelContainerlastname);
    } else {
      values.putNull(Staff_Table.lastname.getCursorKey());
    }
    String modelContainermobileNo = modelContainer.getStringValue("mobileNo");
    if (modelContainermobileNo != null) {
      values.put(Staff_Table.mobileNo.getCursorKey(), modelContainermobileNo);
    } else {
      values.putNull(Staff_Table.mobileNo.getCursorKey());
    }
    String modelContainerdisplayName = modelContainer.getStringValue("displayName");
    if (modelContainerdisplayName != null) {
      values.put(Staff_Table.displayName.getCursorKey(), modelContainerdisplayName);
    } else {
      values.putNull(Staff_Table.displayName.getCursorKey());
    }
    Integer modelContainerofficeId = modelContainer.getIntegerValue("officeId");
    if (modelContainerofficeId != null) {
      values.put(Staff_Table.officeId.getCursorKey(), modelContainerofficeId);
    } else {
      values.putNull(Staff_Table.officeId.getCursorKey());
    }
    String modelContainerofficeName = modelContainer.getStringValue("officeName");
    if (modelContainerofficeName != null) {
      values.put(Staff_Table.officeName.getCursorKey(), modelContainerofficeName);
    } else {
      values.putNull(Staff_Table.officeName.getCursorKey());
    }
    Integer modelContainerisLoanOfficer = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isLoanOfficer"));
    if (modelContainerisLoanOfficer != null) {
      values.put(Staff_Table.isLoanOfficer.getCursorKey(), modelContainerisLoanOfficer);
    } else {
      values.putNull(Staff_Table.isLoanOfficer.getCursorKey());
    }
    Integer modelContainerisActive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isActive"));
    if (modelContainerisActive != null) {
      values.put(Staff_Table.isActive.getCursorKey(), modelContainerisActive);
    } else {
      values.putNull(Staff_Table.isActive.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Staff, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Staff, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContainerfirstname = modelContainer.getStringValue("firstname");
    if (modelContainerfirstname != null) {
      statement.bindString(2 + start, modelContainerfirstname);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainerlastname = modelContainer.getStringValue("lastname");
    if (modelContainerlastname != null) {
      statement.bindString(3 + start, modelContainerlastname);
    } else {
      statement.bindNull(3 + start);
    }
    String modelContainermobileNo = modelContainer.getStringValue("mobileNo");
    if (modelContainermobileNo != null) {
      statement.bindString(4 + start, modelContainermobileNo);
    } else {
      statement.bindNull(4 + start);
    }
    String modelContainerdisplayName = modelContainer.getStringValue("displayName");
    if (modelContainerdisplayName != null) {
      statement.bindString(5 + start, modelContainerdisplayName);
    } else {
      statement.bindNull(5 + start);
    }
    Integer modelContainerofficeId = modelContainer.getIntegerValue("officeId");
    if (modelContainerofficeId != null) {
      statement.bindLong(6 + start, modelContainerofficeId);
    } else {
      statement.bindNull(6 + start);
    }
    String modelContainerofficeName = modelContainer.getStringValue("officeName");
    if (modelContainerofficeName != null) {
      statement.bindString(7 + start, modelContainerofficeName);
    } else {
      statement.bindNull(7 + start);
    }
    Integer modelContainerisLoanOfficer = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isLoanOfficer"));
    if (modelContainerisLoanOfficer != null) {
      statement.bindLong(8 + start, modelContainerisLoanOfficer);
    } else {
      statement.bindNull(8 + start);
    }
    Integer modelContainerisActive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("isActive"));
    if (modelContainerisActive != null) {
      statement.bindLong(9 + start, modelContainerisActive);
    } else {
      statement.bindNull(9 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Staff, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Staff, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Staff.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Staff, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Staff_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final Staff toModel(ModelContainer<Staff, ?> modelContainer) {
    Staff model = new Staff();
    model.id = modelContainer.getIntegerValue("id");
    model.firstname = modelContainer.getStringValue("firstname");
    model.lastname = modelContainer.getStringValue("lastname");
    model.mobileNo = modelContainer.getStringValue("mobileNo");
    model.displayName = modelContainer.getStringValue("displayName");
    model.officeId = modelContainer.getIntegerValue("officeId");
    model.officeName = modelContainer.getStringValue("officeName");
    model.isLoanOfficer = modelContainer.getBooleanValue("isLoanOfficer");
    model.isActive = modelContainer.getBooleanValue("isActive");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Staff, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexfirstname = cursor.getColumnIndex("firstname");
    if (indexfirstname != -1 && !cursor.isNull(indexfirstname)) {
      modelContainer.put("firstname", cursor.getString(indexfirstname));
    } else {
      modelContainer.putDefault("firstname");
    }
    int indexlastname = cursor.getColumnIndex("lastname");
    if (indexlastname != -1 && !cursor.isNull(indexlastname)) {
      modelContainer.put("lastname", cursor.getString(indexlastname));
    } else {
      modelContainer.putDefault("lastname");
    }
    int indexmobileNo = cursor.getColumnIndex("mobileNo");
    if (indexmobileNo != -1 && !cursor.isNull(indexmobileNo)) {
      modelContainer.put("mobileNo", cursor.getString(indexmobileNo));
    } else {
      modelContainer.putDefault("mobileNo");
    }
    int indexdisplayName = cursor.getColumnIndex("displayName");
    if (indexdisplayName != -1 && !cursor.isNull(indexdisplayName)) {
      modelContainer.put("displayName", cursor.getString(indexdisplayName));
    } else {
      modelContainer.putDefault("displayName");
    }
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      modelContainer.put("officeId", cursor.getInt(indexofficeId));
    } else {
      modelContainer.putDefault("officeId");
    }
    int indexofficeName = cursor.getColumnIndex("officeName");
    if (indexofficeName != -1 && !cursor.isNull(indexofficeName)) {
      modelContainer.put("officeName", cursor.getString(indexofficeName));
    } else {
      modelContainer.putDefault("officeName");
    }
    int indexisLoanOfficer = cursor.getColumnIndex("isLoanOfficer");
    if (indexisLoanOfficer != -1 && !cursor.isNull(indexisLoanOfficer)) {
      modelContainer.put("isLoanOfficer", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisLoanOfficer)));
    } else {
      modelContainer.putDefault("isLoanOfficer");
    }
    int indexisActive = cursor.getColumnIndex("isActive");
    if (indexisActive != -1 && !cursor.isNull(indexisActive)) {
      modelContainer.put("isActive", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisActive)));
    } else {
      modelContainer.putDefault("isActive");
    }
  }

  @Override
  public final ForeignKeyContainer<Staff> toForeignKeyContainer(Staff model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Staff.class);
    modelContainer.put(Staff_Table.id, model.id);
    return modelContainer;
  }
}
