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
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class GroupDate_Container extends ModelContainerAdapter<GroupDate> {
  public GroupDate_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("groupId", long.class);
    columnMap.put("chargeId", long.class);
    columnMap.put("day", int.class);
    columnMap.put("month", int.class);
    columnMap.put("year", int.class);
  }

  @Override
  public final Class<GroupDate> getModelClass() {
    return GroupDate.class;
  }

  public final String getTableName() {
    return "`GroupDate`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<GroupDate, ?> modelContainer) {
    values.put(GroupDate_Table.groupId.getCursorKey(), modelContainer.getLngValue("groupId"));
    values.put(GroupDate_Table.chargeId.getCursorKey(), modelContainer.getLngValue("chargeId"));
    values.put(GroupDate_Table.day.getCursorKey(), modelContainer.getIntValue("day"));
    values.put(GroupDate_Table.month.getCursorKey(), modelContainer.getIntValue("month"));
    values.put(GroupDate_Table.year.getCursorKey(), modelContainer.getIntValue("year"));
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<GroupDate, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<GroupDate, ?> modelContainer, int start) {
    statement.bindLong(1 + start, modelContainer.getLngValue("groupId"));
    statement.bindLong(2 + start, modelContainer.getLngValue("chargeId"));
    statement.bindLong(3 + start, modelContainer.getIntValue("day"));
    statement.bindLong(4 + start, modelContainer.getIntValue("month"));
    statement.bindLong(5 + start, modelContainer.getIntValue("year"));
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<GroupDate, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<GroupDate, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(GroupDate.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<GroupDate, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(GroupDate_Table.groupId.eq(modelContainer.getLngValue("groupId")));
    clause.and(GroupDate_Table.chargeId.eq(modelContainer.getLngValue("chargeId")));return clause;
  }

  @Override
  public final GroupDate toModel(ModelContainer<GroupDate, ?> modelContainer) {
    GroupDate model = new GroupDate();
    model.groupId = modelContainer.getLngValue("groupId");
    model.chargeId = modelContainer.getLngValue("chargeId");
    model.day = modelContainer.getIntValue("day");
    model.month = modelContainer.getIntValue("month");
    model.year = modelContainer.getIntValue("year");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<GroupDate, ?> modelContainer) {
    int indexgroupId = cursor.getColumnIndex("groupId");
    if (indexgroupId != -1 && !cursor.isNull(indexgroupId)) {
      modelContainer.put("groupId", cursor.getLong(indexgroupId));
    } else {
      modelContainer.putDefault("groupId");
    }
    int indexchargeId = cursor.getColumnIndex("chargeId");
    if (indexchargeId != -1 && !cursor.isNull(indexchargeId)) {
      modelContainer.put("chargeId", cursor.getLong(indexchargeId));
    } else {
      modelContainer.putDefault("chargeId");
    }
    int indexday = cursor.getColumnIndex("day");
    if (indexday != -1 && !cursor.isNull(indexday)) {
      modelContainer.put("day", cursor.getInt(indexday));
    } else {
      modelContainer.putDefault("day");
    }
    int indexmonth = cursor.getColumnIndex("month");
    if (indexmonth != -1 && !cursor.isNull(indexmonth)) {
      modelContainer.put("month", cursor.getInt(indexmonth));
    } else {
      modelContainer.putDefault("month");
    }
    int indexyear = cursor.getColumnIndex("year");
    if (indexyear != -1 && !cursor.isNull(indexyear)) {
      modelContainer.put("year", cursor.getInt(indexyear));
    } else {
      modelContainer.putDefault("year");
    }
  }

  @Override
  public final ForeignKeyContainer<GroupDate> toForeignKeyContainer(GroupDate model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(GroupDate.class);
    modelContainer.put(GroupDate_Table.groupId, model.groupId);
    modelContainer.put(GroupDate_Table.chargeId, model.chargeId);
    return modelContainer;
  }
}
