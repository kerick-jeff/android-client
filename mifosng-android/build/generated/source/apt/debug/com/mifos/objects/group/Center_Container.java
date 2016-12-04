package com.mifos.objects.group;

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
public final class Center_Container extends ModelContainerAdapter<Center> {
  public Center_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("sync", Boolean.class);
    columnMap.put("accountNo", String.class);
    columnMap.put("name", String.class);
    columnMap.put("officeId", Integer.class);
    columnMap.put("officeName", String.class);
    columnMap.put("staffId", Integer.class);
    columnMap.put("staffName", String.class);
    columnMap.put("hierarchy", String.class);
    columnMap.put("active", Boolean.class);
  }

  @Override
  public final Class<Center> getModelClass() {
    return Center.class;
  }

  public final String getTableName() {
    return "`Center`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Center, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(Center_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(Center_Table.id.getCursorKey());
    }
    Integer modelContainersync = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("sync"));
    if (modelContainersync != null) {
      values.put(Center_Table.sync.getCursorKey(), modelContainersync);
    } else {
      values.putNull(Center_Table.sync.getCursorKey());
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      values.put(Center_Table.accountNo.getCursorKey(), modelContaineraccountNo);
    } else {
      values.putNull(Center_Table.accountNo.getCursorKey());
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      values.put(Center_Table.name.getCursorKey(), modelContainername);
    } else {
      values.putNull(Center_Table.name.getCursorKey());
    }
    Integer modelContainerofficeId = modelContainer.getIntegerValue("officeId");
    if (modelContainerofficeId != null) {
      values.put(Center_Table.officeId.getCursorKey(), modelContainerofficeId);
    } else {
      values.putNull(Center_Table.officeId.getCursorKey());
    }
    String modelContainerofficeName = modelContainer.getStringValue("officeName");
    if (modelContainerofficeName != null) {
      values.put(Center_Table.officeName.getCursorKey(), modelContainerofficeName);
    } else {
      values.putNull(Center_Table.officeName.getCursorKey());
    }
    Integer modelContainerstaffId = modelContainer.getIntegerValue("staffId");
    if (modelContainerstaffId != null) {
      values.put(Center_Table.staffId.getCursorKey(), modelContainerstaffId);
    } else {
      values.putNull(Center_Table.staffId.getCursorKey());
    }
    String modelContainerstaffName = modelContainer.getStringValue("staffName");
    if (modelContainerstaffName != null) {
      values.put(Center_Table.staffName.getCursorKey(), modelContainerstaffName);
    } else {
      values.putNull(Center_Table.staffName.getCursorKey());
    }
    String modelContainerhierarchy = modelContainer.getStringValue("hierarchy");
    if (modelContainerhierarchy != null) {
      values.put(Center_Table.hierarchy.getCursorKey(), modelContainerhierarchy);
    } else {
      values.putNull(Center_Table.hierarchy.getCursorKey());
    }
    Integer modelContaineractive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("active"));
    if (modelContaineractive != null) {
      values.put(Center_Table.active.getCursorKey(), modelContaineractive);
    } else {
      values.putNull(Center_Table.active.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Center, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Center, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    Integer modelContainersync = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("sync"));
    if (modelContainersync != null) {
      statement.bindLong(2 + start, modelContainersync);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      statement.bindString(3 + start, modelContaineraccountNo);
    } else {
      statement.bindNull(3 + start);
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      statement.bindString(4 + start, modelContainername);
    } else {
      statement.bindNull(4 + start);
    }
    Integer modelContainerofficeId = modelContainer.getIntegerValue("officeId");
    if (modelContainerofficeId != null) {
      statement.bindLong(5 + start, modelContainerofficeId);
    } else {
      statement.bindNull(5 + start);
    }
    String modelContainerofficeName = modelContainer.getStringValue("officeName");
    if (modelContainerofficeName != null) {
      statement.bindString(6 + start, modelContainerofficeName);
    } else {
      statement.bindNull(6 + start);
    }
    Integer modelContainerstaffId = modelContainer.getIntegerValue("staffId");
    if (modelContainerstaffId != null) {
      statement.bindLong(7 + start, modelContainerstaffId);
    } else {
      statement.bindNull(7 + start);
    }
    String modelContainerstaffName = modelContainer.getStringValue("staffName");
    if (modelContainerstaffName != null) {
      statement.bindString(8 + start, modelContainerstaffName);
    } else {
      statement.bindNull(8 + start);
    }
    String modelContainerhierarchy = modelContainer.getStringValue("hierarchy");
    if (modelContainerhierarchy != null) {
      statement.bindString(9 + start, modelContainerhierarchy);
    } else {
      statement.bindNull(9 + start);
    }
    Integer modelContaineractive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("active"));
    if (modelContaineractive != null) {
      statement.bindLong(10 + start, modelContaineractive);
    } else {
      statement.bindNull(10 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Center, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Center, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Center.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Center, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Center_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final Center toModel(ModelContainer<Center, ?> modelContainer) {
    Center model = new Center();
    model.id = modelContainer.getIntegerValue("id");
    model.sync = modelContainer.getBooleanValue("sync");
    model.accountNo = modelContainer.getStringValue("accountNo");
    model.name = modelContainer.getStringValue("name");
    model.officeId = modelContainer.getIntegerValue("officeId");
    model.officeName = modelContainer.getStringValue("officeName");
    model.staffId = modelContainer.getIntegerValue("staffId");
    model.staffName = modelContainer.getStringValue("staffName");
    model.hierarchy = modelContainer.getStringValue("hierarchy");
    model.active = modelContainer.getBooleanValue("active");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Center, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexsync = cursor.getColumnIndex("sync");
    if (indexsync != -1 && !cursor.isNull(indexsync)) {
      modelContainer.put("sync", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexsync)));
    } else {
      modelContainer.putDefault("sync");
    }
    int indexaccountNo = cursor.getColumnIndex("accountNo");
    if (indexaccountNo != -1 && !cursor.isNull(indexaccountNo)) {
      modelContainer.put("accountNo", cursor.getString(indexaccountNo));
    } else {
      modelContainer.putDefault("accountNo");
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      modelContainer.put("name", cursor.getString(indexname));
    } else {
      modelContainer.putDefault("name");
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
    int indexstaffId = cursor.getColumnIndex("staffId");
    if (indexstaffId != -1 && !cursor.isNull(indexstaffId)) {
      modelContainer.put("staffId", cursor.getInt(indexstaffId));
    } else {
      modelContainer.putDefault("staffId");
    }
    int indexstaffName = cursor.getColumnIndex("staffName");
    if (indexstaffName != -1 && !cursor.isNull(indexstaffName)) {
      modelContainer.put("staffName", cursor.getString(indexstaffName));
    } else {
      modelContainer.putDefault("staffName");
    }
    int indexhierarchy = cursor.getColumnIndex("hierarchy");
    if (indexhierarchy != -1 && !cursor.isNull(indexhierarchy)) {
      modelContainer.put("hierarchy", cursor.getString(indexhierarchy));
    } else {
      modelContainer.putDefault("hierarchy");
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      modelContainer.put("active", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexactive)));
    } else {
      modelContainer.putDefault("active");
    }
  }

  @Override
  public final ForeignKeyContainer<Center> toForeignKeyContainer(Center model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Center.class);
    modelContainer.put(Center_Table.id, model.id);
    return modelContainer;
  }
}
