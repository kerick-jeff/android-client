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
public final class StaffOptions_Container extends ModelContainerAdapter<StaffOptions> {
  public StaffOptions_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", int.class);
    columnMap.put("firstname", String.class);
    columnMap.put("lastname", String.class);
    columnMap.put("displayName", String.class);
    columnMap.put("officeId", int.class);
    columnMap.put("officeName", String.class);
    columnMap.put("isLoan_officer", boolean.class);
    columnMap.put("is_Active", boolean.class);
  }

  @Override
  public final Class<StaffOptions> getModelClass() {
    return StaffOptions.class;
  }

  public final String getTableName() {
    return "`ClientTemplateStaffOptions`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<StaffOptions, ?> modelContainer) {
    values.put(StaffOptions_Table.id.getCursorKey(), modelContainer.getIntValue("id"));
    String modelContainerfirstname = modelContainer.getStringValue("firstname");
    if (modelContainerfirstname != null) {
      values.put(StaffOptions_Table.firstname.getCursorKey(), modelContainerfirstname);
    } else {
      values.putNull(StaffOptions_Table.firstname.getCursorKey());
    }
    String modelContainerlastname = modelContainer.getStringValue("lastname");
    if (modelContainerlastname != null) {
      values.put(StaffOptions_Table.lastname.getCursorKey(), modelContainerlastname);
    } else {
      values.putNull(StaffOptions_Table.lastname.getCursorKey());
    }
    String modelContainerdisplayName = modelContainer.getStringValue("displayName");
    if (modelContainerdisplayName != null) {
      values.put(StaffOptions_Table.displayName.getCursorKey(), modelContainerdisplayName);
    } else {
      values.putNull(StaffOptions_Table.displayName.getCursorKey());
    }
    values.put(StaffOptions_Table.officeId.getCursorKey(), modelContainer.getIntValue("officeId"));
    String modelContainerofficeName = modelContainer.getStringValue("officeName");
    if (modelContainerofficeName != null) {
      values.put(StaffOptions_Table.officeName.getCursorKey(), modelContainerofficeName);
    } else {
      values.putNull(StaffOptions_Table.officeName.getCursorKey());
    }
    values.put(StaffOptions_Table.isLoan_officer.getCursorKey(), modelContainer.getBoolValue("isLoan_officer"));
    values.put(StaffOptions_Table.is_Active.getCursorKey(), modelContainer.getBoolValue("is_Active"));
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<StaffOptions, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<StaffOptions, ?> modelContainer, int start) {
    statement.bindLong(1 + start, modelContainer.getIntValue("id"));
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
    String modelContainerdisplayName = modelContainer.getStringValue("displayName");
    if (modelContainerdisplayName != null) {
      statement.bindString(4 + start, modelContainerdisplayName);
    } else {
      statement.bindNull(4 + start);
    }
    statement.bindLong(5 + start, modelContainer.getIntValue("officeId"));
    String modelContainerofficeName = modelContainer.getStringValue("officeName");
    if (modelContainerofficeName != null) {
      statement.bindString(6 + start, modelContainerofficeName);
    } else {
      statement.bindNull(6 + start);
    }
    statement.bindLong(7 + start, modelContainer.getBoolValue("isLoan_officer") ? 1 : 0);
    statement.bindLong(8 + start, modelContainer.getBoolValue("is_Active") ? 1 : 0);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<StaffOptions, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<StaffOptions, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(StaffOptions.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<StaffOptions, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(StaffOptions_Table.id.eq(modelContainer.getIntValue("id")));return clause;
  }

  @Override
  public final StaffOptions toModel(ModelContainer<StaffOptions, ?> modelContainer) {
    StaffOptions model = new StaffOptions();
    model.id = modelContainer.getIntValue("id");
    model.firstname = modelContainer.getStringValue("firstname");
    model.lastname = modelContainer.getStringValue("lastname");
    model.displayName = modelContainer.getStringValue("displayName");
    model.officeId = modelContainer.getIntValue("officeId");
    model.officeName = modelContainer.getStringValue("officeName");
    model.isLoan_officer = modelContainer.getBoolValue("isLoan_officer");
    model.is_Active = modelContainer.getBoolValue("is_Active");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<StaffOptions, ?> modelContainer) {
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
    int indexisLoan_officer = cursor.getColumnIndex("isLoan_officer");
    if (indexisLoan_officer != -1 && !cursor.isNull(indexisLoan_officer)) {
      modelContainer.put("isLoan_officer", cursor.getInt(indexisLoan_officer));
    } else {
      modelContainer.putDefault("isLoan_officer");
    }
    int indexis_Active = cursor.getColumnIndex("is_Active");
    if (indexis_Active != -1 && !cursor.isNull(indexis_Active)) {
      modelContainer.put("is_Active", cursor.getInt(indexis_Active));
    } else {
      modelContainer.putDefault("is_Active");
    }
  }

  @Override
  public final ForeignKeyContainer<StaffOptions> toForeignKeyContainer(StaffOptions model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(StaffOptions.class);
    modelContainer.put(StaffOptions_Table.id, model.id);
    return modelContainer;
  }
}
