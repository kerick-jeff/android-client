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
public final class Group_Container extends ModelContainerAdapter<Group> {
  public Group_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("accountNo", String.class);
    columnMap.put("sync", boolean.class);
    columnMap.put("name", String.class);
    columnMap.put("active", Boolean.class);
    columnMap.put("groupDate", GroupDate.class);
    columnMap.put("officeId", Integer.class);
    columnMap.put("officeName", String.class);
    columnMap.put("centerId", int.class);
    columnMap.put("centerName", String.class);
    columnMap.put("staffId", Integer.class);
    columnMap.put("staffName", String.class);
    columnMap.put("hierarchy", String.class);
    columnMap.put("groupLevel", int.class);
  }

  @Override
  public final Class<Group> getModelClass() {
    return Group.class;
  }

  public final String getTableName() {
    return "`Group`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Group, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(Group_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(Group_Table.id.getCursorKey());
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      values.put(Group_Table.accountNo.getCursorKey(), modelContaineraccountNo);
    } else {
      values.putNull(Group_Table.accountNo.getCursorKey());
    }
    values.put(Group_Table.sync.getCursorKey(), modelContainer.getBoolValue("sync"));
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      values.put(Group_Table.name.getCursorKey(), modelContainername);
    } else {
      values.putNull(Group_Table.name.getCursorKey());
    }
    Integer modelContaineractive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("active"));
    if (modelContaineractive != null) {
      values.put(Group_Table.active.getCursorKey(), modelContaineractive);
    } else {
      values.putNull(Group_Table.active.getCursorKey());
    }
    ModelContainer<GroupDate, ?> refgroupDate = modelContainer.getInstance(modelContainer.getValue("groupDate"), com.mifos.objects.group.GroupDate.class);
    if (refgroupDate != null) {
      refgroupDate.save();
      values.put(Group_Table.groupDate_groupId.getCursorKey(), refgroupDate.getLngValue("groupId"));
      values.put(Group_Table.groupDate_chargeId.getCursorKey(), refgroupDate.getLngValue("chargeId"));
    } else {
      values.putNull("`groupDate_groupId`");
      values.putNull("`groupDate_chargeId`");
    }
    Integer modelContainerofficeId = modelContainer.getIntegerValue("officeId");
    if (modelContainerofficeId != null) {
      values.put(Group_Table.officeId.getCursorKey(), modelContainerofficeId);
    } else {
      values.putNull(Group_Table.officeId.getCursorKey());
    }
    String modelContainerofficeName = modelContainer.getStringValue("officeName");
    if (modelContainerofficeName != null) {
      values.put(Group_Table.officeName.getCursorKey(), modelContainerofficeName);
    } else {
      values.putNull(Group_Table.officeName.getCursorKey());
    }
    values.put(Group_Table.centerId.getCursorKey(), modelContainer.getIntValue("centerId"));
    String modelContainercenterName = modelContainer.getStringValue("centerName");
    if (modelContainercenterName != null) {
      values.put(Group_Table.centerName.getCursorKey(), modelContainercenterName);
    } else {
      values.putNull(Group_Table.centerName.getCursorKey());
    }
    Integer modelContainerstaffId = modelContainer.getIntegerValue("staffId");
    if (modelContainerstaffId != null) {
      values.put(Group_Table.staffId.getCursorKey(), modelContainerstaffId);
    } else {
      values.putNull(Group_Table.staffId.getCursorKey());
    }
    String modelContainerstaffName = modelContainer.getStringValue("staffName");
    if (modelContainerstaffName != null) {
      values.put(Group_Table.staffName.getCursorKey(), modelContainerstaffName);
    } else {
      values.putNull(Group_Table.staffName.getCursorKey());
    }
    String modelContainerhierarchy = modelContainer.getStringValue("hierarchy");
    if (modelContainerhierarchy != null) {
      values.put(Group_Table.hierarchy.getCursorKey(), modelContainerhierarchy);
    } else {
      values.putNull(Group_Table.hierarchy.getCursorKey());
    }
    values.put(Group_Table.groupLevel.getCursorKey(), modelContainer.getIntValue("groupLevel"));
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Group, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Group, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      statement.bindString(2 + start, modelContaineraccountNo);
    } else {
      statement.bindNull(2 + start);
    }
    statement.bindLong(3 + start, modelContainer.getBoolValue("sync") ? 1 : 0);
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      statement.bindString(4 + start, modelContainername);
    } else {
      statement.bindNull(4 + start);
    }
    Integer modelContaineractive = (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) modelContainer.getBooleanValue("active"));
    if (modelContaineractive != null) {
      statement.bindLong(5 + start, modelContaineractive);
    } else {
      statement.bindNull(5 + start);
    }
    ModelContainer<GroupDate, ?> refgroupDate = modelContainer.getInstance(modelContainer.getValue("groupDate"), com.mifos.objects.group.GroupDate.class);
    if (refgroupDate != null) {
      refgroupDate.save();
      statement.bindLong(6 + start, refgroupDate.getLngValue("groupId"));
      statement.bindLong(7 + start, refgroupDate.getLngValue("chargeId"));
    } else {
      statement.bindNull(6 + start);
      statement.bindNull(7 + start);
    }
    Integer modelContainerofficeId = modelContainer.getIntegerValue("officeId");
    if (modelContainerofficeId != null) {
      statement.bindLong(8 + start, modelContainerofficeId);
    } else {
      statement.bindNull(8 + start);
    }
    String modelContainerofficeName = modelContainer.getStringValue("officeName");
    if (modelContainerofficeName != null) {
      statement.bindString(9 + start, modelContainerofficeName);
    } else {
      statement.bindNull(9 + start);
    }
    statement.bindLong(10 + start, modelContainer.getIntValue("centerId"));
    String modelContainercenterName = modelContainer.getStringValue("centerName");
    if (modelContainercenterName != null) {
      statement.bindString(11 + start, modelContainercenterName);
    } else {
      statement.bindNull(11 + start);
    }
    Integer modelContainerstaffId = modelContainer.getIntegerValue("staffId");
    if (modelContainerstaffId != null) {
      statement.bindLong(12 + start, modelContainerstaffId);
    } else {
      statement.bindNull(12 + start);
    }
    String modelContainerstaffName = modelContainer.getStringValue("staffName");
    if (modelContainerstaffName != null) {
      statement.bindString(13 + start, modelContainerstaffName);
    } else {
      statement.bindNull(13 + start);
    }
    String modelContainerhierarchy = modelContainer.getStringValue("hierarchy");
    if (modelContainerhierarchy != null) {
      statement.bindString(14 + start, modelContainerhierarchy);
    } else {
      statement.bindNull(14 + start);
    }
    statement.bindLong(15 + start, modelContainer.getIntValue("groupLevel"));
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Group, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Group, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Group.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Group, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Group_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final Group toModel(ModelContainer<Group, ?> modelContainer) {
    Group model = new Group();
    model.id = modelContainer.getIntegerValue("id");
    model.accountNo = modelContainer.getStringValue("accountNo");
    model.sync = modelContainer.getBoolValue("sync");
    model.name = modelContainer.getStringValue("name");
    model.active = modelContainer.getBooleanValue("active");
    ModelContainer<GroupDate, ?> refgroupDate = modelContainer.getInstance(modelContainer.getValue("groupDate"), com.mifos.objects.group.GroupDate.class);
    if (refgroupDate != null) {
      model.groupDate = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.group.GroupDate.class).toModel(refgroupDate);
    }
    model.officeId = modelContainer.getIntegerValue("officeId");
    model.officeName = modelContainer.getStringValue("officeName");
    model.centerId = modelContainer.getIntValue("centerId");
    model.centerName = modelContainer.getStringValue("centerName");
    model.staffId = modelContainer.getIntegerValue("staffId");
    model.staffName = modelContainer.getStringValue("staffName");
    model.hierarchy = modelContainer.getStringValue("hierarchy");
    model.groupLevel = modelContainer.getIntValue("groupLevel");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Group, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexaccountNo = cursor.getColumnIndex("accountNo");
    if (indexaccountNo != -1 && !cursor.isNull(indexaccountNo)) {
      modelContainer.put("accountNo", cursor.getString(indexaccountNo));
    } else {
      modelContainer.putDefault("accountNo");
    }
    int indexsync = cursor.getColumnIndex("sync");
    if (indexsync != -1 && !cursor.isNull(indexsync)) {
      modelContainer.put("sync", cursor.getInt(indexsync));
    } else {
      modelContainer.putDefault("sync");
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      modelContainer.put("name", cursor.getString(indexname));
    } else {
      modelContainer.putDefault("name");
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      modelContainer.put("active", (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexactive)));
    } else {
      modelContainer.putDefault("active");
    }
    //// Only load model if references match, for efficiency
    int indexgroupDate_groupId = cursor.getColumnIndex("groupDate_groupId");
    int indexgroupDate_chargeId = cursor.getColumnIndex("groupDate_chargeId");
    if (indexgroupDate_groupId != -1 && !cursor.isNull(indexgroupDate_groupId) && indexgroupDate_chargeId != -1 && !cursor.isNull(indexgroupDate_chargeId)) {
      modelContainer.put("groupDate", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.group.GroupDate.class).where()
          .and(com.mifos.objects.group.GroupDate_Table.groupId.eq(cursor.getLong(indexgroupDate_groupId)))
          .and(com.mifos.objects.group.GroupDate_Table.chargeId.eq(cursor.getLong(indexgroupDate_chargeId))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.group.GroupDate.class)).getData());
    } else {
      modelContainer.putDefault("groupDate");
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
    int indexcenterId = cursor.getColumnIndex("centerId");
    if (indexcenterId != -1 && !cursor.isNull(indexcenterId)) {
      modelContainer.put("centerId", cursor.getInt(indexcenterId));
    } else {
      modelContainer.putDefault("centerId");
    }
    int indexcenterName = cursor.getColumnIndex("centerName");
    if (indexcenterName != -1 && !cursor.isNull(indexcenterName)) {
      modelContainer.put("centerName", cursor.getString(indexcenterName));
    } else {
      modelContainer.putDefault("centerName");
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
    int indexgroupLevel = cursor.getColumnIndex("groupLevel");
    if (indexgroupLevel != -1 && !cursor.isNull(indexgroupLevel)) {
      modelContainer.put("groupLevel", cursor.getInt(indexgroupLevel));
    } else {
      modelContainer.putDefault("groupLevel");
    }
  }

  @Override
  public final ForeignKeyContainer<Group> toForeignKeyContainer(Group model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Group.class);
    modelContainer.put(Group_Table.id, model.id);
    return modelContainer;
  }
}
