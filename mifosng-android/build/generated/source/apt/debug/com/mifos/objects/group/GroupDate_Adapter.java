package com.mifos.objects.group;

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
import java.lang.Override;
import java.lang.String;

public final class GroupDate_Adapter extends ModelAdapter<GroupDate> {
  public GroupDate_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<GroupDate> getModelClass() {
    return GroupDate.class;
  }

  public final String getTableName() {
    return "`GroupDate`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return GroupDate_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, GroupDate model) {
    values.put(GroupDate_Table.groupId.getCursorKey(), model.groupId);
    values.put(GroupDate_Table.chargeId.getCursorKey(), model.chargeId);
    values.put(GroupDate_Table.day.getCursorKey(), model.day);
    values.put(GroupDate_Table.month.getCursorKey(), model.month);
    values.put(GroupDate_Table.year.getCursorKey(), model.year);
  }

  @Override
  public final void bindToContentValues(ContentValues values, GroupDate model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, GroupDate model, int start) {
    statement.bindLong(1 + start, model.groupId);
    statement.bindLong(2 + start, model.chargeId);
    statement.bindLong(3 + start, model.day);
    statement.bindLong(4 + start, model.month);
    statement.bindLong(5 + start, model.year);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, GroupDate model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `GroupDate`(`groupId`,`chargeId`,`day`,`month`,`year`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `GroupDate`(`groupId`,`chargeId`,`day`,`month`,`year`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `GroupDate`(`groupId` INTEGER,`chargeId` INTEGER,`day` INTEGER,`month` INTEGER,`year` INTEGER, PRIMARY KEY(`groupId`,`chargeId`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, GroupDate model) {
    int indexgroupId = cursor.getColumnIndex("groupId");
    if (indexgroupId != -1 && !cursor.isNull(indexgroupId)) {
      model.groupId = cursor.getLong(indexgroupId);
    } else {
      model.groupId = 0;
    }
    int indexchargeId = cursor.getColumnIndex("chargeId");
    if (indexchargeId != -1 && !cursor.isNull(indexchargeId)) {
      model.chargeId = cursor.getLong(indexchargeId);
    } else {
      model.chargeId = 0;
    }
    int indexday = cursor.getColumnIndex("day");
    if (indexday != -1 && !cursor.isNull(indexday)) {
      model.day = cursor.getInt(indexday);
    } else {
      model.day = 0;
    }
    int indexmonth = cursor.getColumnIndex("month");
    if (indexmonth != -1 && !cursor.isNull(indexmonth)) {
      model.month = cursor.getInt(indexmonth);
    } else {
      model.month = 0;
    }
    int indexyear = cursor.getColumnIndex("year");
    if (indexyear != -1 && !cursor.isNull(indexyear)) {
      model.year = cursor.getInt(indexyear);
    } else {
      model.year = 0;
    }
  }

  @Override
  public final boolean exists(GroupDate model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(GroupDate.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(GroupDate model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(GroupDate_Table.groupId.eq(model.groupId));
    clause.and(GroupDate_Table.chargeId.eq(model.chargeId));return clause;
  }

  @Override
  public final GroupDate newInstance() {
    return new GroupDate();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return GroupDate_Table.getProperty(name);
  }
}
