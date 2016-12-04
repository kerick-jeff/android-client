package com.mifos.objects.group;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.config.FlowManager;
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

public final class Group_Adapter extends ModelAdapter<Group> {
  public Group_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Group> getModelClass() {
    return Group.class;
  }

  public final String getTableName() {
    return "`Group`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Group_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Group model) {
    if (model.id != null) {
      values.put(Group_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(Group_Table.id.getCursorKey());
    }
    if (model.accountNo != null) {
      values.put(Group_Table.accountNo.getCursorKey(), model.accountNo);
    } else {
      values.putNull(Group_Table.accountNo.getCursorKey());
    }
    values.put(Group_Table.sync.getCursorKey(), model.sync ? 1 : 0);
    if (model.name != null) {
      values.put(Group_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(Group_Table.name.getCursorKey());
    }
    Integer refactive = model.active != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.active) : null;
    if (refactive != null) {
      values.put(Group_Table.active.getCursorKey(), refactive);
    } else {
      values.putNull(Group_Table.active.getCursorKey());
    }
    if (model.groupDate != null) {
      model.groupDate.save();
      values.put(Group_Table.groupDate_groupId.getCursorKey(), model.groupDate.groupId);
      values.put(Group_Table.groupDate_chargeId.getCursorKey(), model.groupDate.chargeId);
    } else {
      values.putNull("`groupDate_groupId`");
      values.putNull("`groupDate_chargeId`");
    }
    if (model.officeId != null) {
      values.put(Group_Table.officeId.getCursorKey(), model.officeId);
    } else {
      values.putNull(Group_Table.officeId.getCursorKey());
    }
    if (model.officeName != null) {
      values.put(Group_Table.officeName.getCursorKey(), model.officeName);
    } else {
      values.putNull(Group_Table.officeName.getCursorKey());
    }
    values.put(Group_Table.centerId.getCursorKey(), model.centerId);
    if (model.centerName != null) {
      values.put(Group_Table.centerName.getCursorKey(), model.centerName);
    } else {
      values.putNull(Group_Table.centerName.getCursorKey());
    }
    if (model.staffId != null) {
      values.put(Group_Table.staffId.getCursorKey(), model.staffId);
    } else {
      values.putNull(Group_Table.staffId.getCursorKey());
    }
    if (model.staffName != null) {
      values.put(Group_Table.staffName.getCursorKey(), model.staffName);
    } else {
      values.putNull(Group_Table.staffName.getCursorKey());
    }
    if (model.hierarchy != null) {
      values.put(Group_Table.hierarchy.getCursorKey(), model.hierarchy);
    } else {
      values.putNull(Group_Table.hierarchy.getCursorKey());
    }
    values.put(Group_Table.groupLevel.getCursorKey(), model.groupLevel);
  }

  @Override
  public final void bindToContentValues(ContentValues values, Group model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Group model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.accountNo != null) {
      statement.bindString(2 + start, model.accountNo);
    } else {
      statement.bindNull(2 + start);
    }
    statement.bindLong(3 + start, model.sync ? 1 : 0);
    if (model.name != null) {
      statement.bindString(4 + start, model.name);
    } else {
      statement.bindNull(4 + start);
    }
    Integer refactive = model.active != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.active) : null;
    if (refactive != null) {
      statement.bindLong(5 + start, refactive);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.groupDate != null) {
      model.groupDate.save();
      statement.bindLong(6 + start, model.groupDate.groupId);
      statement.bindLong(7 + start, model.groupDate.chargeId);
    } else {
      statement.bindNull(6 + start);
      statement.bindNull(7 + start);
    }
    if (model.officeId != null) {
      statement.bindLong(8 + start, model.officeId);
    } else {
      statement.bindNull(8 + start);
    }
    if (model.officeName != null) {
      statement.bindString(9 + start, model.officeName);
    } else {
      statement.bindNull(9 + start);
    }
    statement.bindLong(10 + start, model.centerId);
    if (model.centerName != null) {
      statement.bindString(11 + start, model.centerName);
    } else {
      statement.bindNull(11 + start);
    }
    if (model.staffId != null) {
      statement.bindLong(12 + start, model.staffId);
    } else {
      statement.bindNull(12 + start);
    }
    if (model.staffName != null) {
      statement.bindString(13 + start, model.staffName);
    } else {
      statement.bindNull(13 + start);
    }
    if (model.hierarchy != null) {
      statement.bindString(14 + start, model.hierarchy);
    } else {
      statement.bindNull(14 + start);
    }
    statement.bindLong(15 + start, model.groupLevel);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Group model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Group`(`id`,`accountNo`,`sync`,`name`,`active`,`groupDate_groupId`,`groupDate_chargeId`,`officeId`,`officeName`,`centerId`,`centerName`,`staffId`,`staffName`,`hierarchy`,`groupLevel`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Group`(`id`,`accountNo`,`sync`,`name`,`active`,`groupDate_groupId`,`groupDate_chargeId`,`officeId`,`officeName`,`centerId`,`centerName`,`staffId`,`staffName`,`hierarchy`,`groupLevel`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Group`(`id` INTEGER,`accountNo` TEXT,`sync` INTEGER,`name` TEXT,`active` INTEGER,`groupDate_groupId` INTEGER ,`groupDate_chargeId` INTEGER,`officeId` INTEGER,`officeName` TEXT,`centerId` INTEGER,`centerName` TEXT,`staffId` INTEGER,`staffName` TEXT,`hierarchy` TEXT,`groupLevel` INTEGER, PRIMARY KEY(`id`)"+ ", FOREIGN KEY(`groupDate_groupId`,`groupDate_chargeId`) REFERENCES " + FlowManager.getTableName(GroupDate.class) + "(`groupId`, `chargeId`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Group model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
    }
    int indexaccountNo = cursor.getColumnIndex("accountNo");
    if (indexaccountNo != -1 && !cursor.isNull(indexaccountNo)) {
      model.accountNo = cursor.getString(indexaccountNo);
    } else {
      model.accountNo = null;
    }
    int indexsync = cursor.getColumnIndex("sync");
    if (indexsync != -1 && !cursor.isNull(indexsync)) {
      model.sync = cursor.getInt(indexsync) == 1 ? true : false;
    } else {
      model.sync = false;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      model.active = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexactive));
    } else {
      model.active = null;
    }
    //// Only load model if references match, for efficiency
    int indexgroupDate_groupId = cursor.getColumnIndex("groupDate_groupId");
    int indexgroupDate_chargeId = cursor.getColumnIndex("groupDate_chargeId");
    if (indexgroupDate_groupId != -1 && !cursor.isNull(indexgroupDate_groupId) && indexgroupDate_chargeId != -1 && !cursor.isNull(indexgroupDate_chargeId)) {
      model.groupDate = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.group.GroupDate.class).where()
          .and(com.mifos.objects.group.GroupDate_Table.groupId.eq(cursor.getLong(indexgroupDate_groupId)))
          .and(com.mifos.objects.group.GroupDate_Table.chargeId.eq(cursor.getLong(indexgroupDate_chargeId))).querySingle();
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
    int indexcenterId = cursor.getColumnIndex("centerId");
    if (indexcenterId != -1 && !cursor.isNull(indexcenterId)) {
      model.centerId = cursor.getInt(indexcenterId);
    } else {
      model.centerId = 0;
    }
    int indexcenterName = cursor.getColumnIndex("centerName");
    if (indexcenterName != -1 && !cursor.isNull(indexcenterName)) {
      model.centerName = cursor.getString(indexcenterName);
    } else {
      model.centerName = null;
    }
    int indexstaffId = cursor.getColumnIndex("staffId");
    if (indexstaffId != -1 && !cursor.isNull(indexstaffId)) {
      model.staffId = cursor.getInt(indexstaffId);
    } else {
      model.staffId = null;
    }
    int indexstaffName = cursor.getColumnIndex("staffName");
    if (indexstaffName != -1 && !cursor.isNull(indexstaffName)) {
      model.staffName = cursor.getString(indexstaffName);
    } else {
      model.staffName = null;
    }
    int indexhierarchy = cursor.getColumnIndex("hierarchy");
    if (indexhierarchy != -1 && !cursor.isNull(indexhierarchy)) {
      model.hierarchy = cursor.getString(indexhierarchy);
    } else {
      model.hierarchy = null;
    }
    int indexgroupLevel = cursor.getColumnIndex("groupLevel");
    if (indexgroupLevel != -1 && !cursor.isNull(indexgroupLevel)) {
      model.groupLevel = cursor.getInt(indexgroupLevel);
    } else {
      model.groupLevel = 0;
    }
  }

  @Override
  public final boolean exists(Group model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Group.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Group model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Group_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Group newInstance() {
    return new Group();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Group_Table.getProperty(name);
  }
}
