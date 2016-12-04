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
public final class GroupPayload_Container extends ModelContainerAdapter<GroupPayload> {
  public GroupPayload_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", int.class);
    columnMap.put("errorMessage", String.class);
    columnMap.put("officeId", int.class);
    columnMap.put("active", boolean.class);
    columnMap.put("activationDate", String.class);
    columnMap.put("submittedOnDate", String.class);
    columnMap.put("externalId", String.class);
    columnMap.put("name", String.class);
    columnMap.put("locale", String.class);
    columnMap.put("dateFormat", String.class);
  }

  @Override
  public final Class<GroupPayload> getModelClass() {
    return GroupPayload.class;
  }

  public final String getTableName() {
    return "`GroupPayload`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<GroupPayload, ?> modelContainer) {
    String modelContainererrorMessage = modelContainer.getStringValue("errorMessage");
    if (modelContainererrorMessage != null) {
      values.put(GroupPayload_Table.errorMessage.getCursorKey(), modelContainererrorMessage);
    } else {
      values.putNull(GroupPayload_Table.errorMessage.getCursorKey());
    }
    values.put(GroupPayload_Table.officeId.getCursorKey(), modelContainer.getIntValue("officeId"));
    values.put(GroupPayload_Table.active.getCursorKey(), modelContainer.getBoolValue("active"));
    String modelContaineractivationDate = modelContainer.getStringValue("activationDate");
    if (modelContaineractivationDate != null) {
      values.put(GroupPayload_Table.activationDate.getCursorKey(), modelContaineractivationDate);
    } else {
      values.putNull(GroupPayload_Table.activationDate.getCursorKey());
    }
    String modelContainersubmittedOnDate = modelContainer.getStringValue("submittedOnDate");
    if (modelContainersubmittedOnDate != null) {
      values.put(GroupPayload_Table.submittedOnDate.getCursorKey(), modelContainersubmittedOnDate);
    } else {
      values.putNull(GroupPayload_Table.submittedOnDate.getCursorKey());
    }
    String modelContainerexternalId = modelContainer.getStringValue("externalId");
    if (modelContainerexternalId != null) {
      values.put(GroupPayload_Table.externalId.getCursorKey(), modelContainerexternalId);
    } else {
      values.putNull(GroupPayload_Table.externalId.getCursorKey());
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      values.put(GroupPayload_Table.name.getCursorKey(), modelContainername);
    } else {
      values.putNull(GroupPayload_Table.name.getCursorKey());
    }
    String modelContainerlocale = modelContainer.getStringValue("locale");
    if (modelContainerlocale != null) {
      values.put(GroupPayload_Table.locale.getCursorKey(), modelContainerlocale);
    } else {
      values.putNull(GroupPayload_Table.locale.getCursorKey());
    }
    String modelContainerdateFormat = modelContainer.getStringValue("dateFormat");
    if (modelContainerdateFormat != null) {
      values.put(GroupPayload_Table.dateFormat.getCursorKey(), modelContainerdateFormat);
    } else {
      values.putNull(GroupPayload_Table.dateFormat.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<GroupPayload, ?> modelContainer) {
    values.put(GroupPayload_Table.id.getCursorKey(), modelContainer.getIntValue("id"));
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<GroupPayload, ?> modelContainer, int start) {
    String modelContainererrorMessage = modelContainer.getStringValue("errorMessage");
    if (modelContainererrorMessage != null) {
      statement.bindString(1 + start, modelContainererrorMessage);
    } else {
      statement.bindNull(1 + start);
    }
    statement.bindLong(2 + start, modelContainer.getIntValue("officeId"));
    statement.bindLong(3 + start, modelContainer.getBoolValue("active") ? 1 : 0);
    String modelContaineractivationDate = modelContainer.getStringValue("activationDate");
    if (modelContaineractivationDate != null) {
      statement.bindString(4 + start, modelContaineractivationDate);
    } else {
      statement.bindNull(4 + start);
    }
    String modelContainersubmittedOnDate = modelContainer.getStringValue("submittedOnDate");
    if (modelContainersubmittedOnDate != null) {
      statement.bindString(5 + start, modelContainersubmittedOnDate);
    } else {
      statement.bindNull(5 + start);
    }
    String modelContainerexternalId = modelContainer.getStringValue("externalId");
    if (modelContainerexternalId != null) {
      statement.bindString(6 + start, modelContainerexternalId);
    } else {
      statement.bindNull(6 + start);
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      statement.bindString(7 + start, modelContainername);
    } else {
      statement.bindNull(7 + start);
    }
    String modelContainerlocale = modelContainer.getStringValue("locale");
    if (modelContainerlocale != null) {
      statement.bindString(8 + start, modelContainerlocale);
    } else {
      statement.bindNull(8 + start);
    }
    String modelContainerdateFormat = modelContainer.getStringValue("dateFormat");
    if (modelContainerdateFormat != null) {
      statement.bindString(9 + start, modelContainerdateFormat);
    } else {
      statement.bindNull(9 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<GroupPayload, ?> modelContainer) {
    statement.bindLong(1, modelContainer.getIntValue("id"));
    bindToInsertStatement(statement, modelContainer, 1);
  }

  @Override
  public final boolean exists(ModelContainer<GroupPayload, ?> modelContainer, DatabaseWrapper wrapper) {
    return modelContainer.getIntValue("id") > 0 && new Select(Method.count()).from(GroupPayload.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<GroupPayload, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(GroupPayload_Table.id.eq(modelContainer.getIntValue("id")));return clause;
  }

  @Override
  public final GroupPayload toModel(ModelContainer<GroupPayload, ?> modelContainer) {
    GroupPayload model = new GroupPayload();
    model.id = modelContainer.getIntValue("id");
    model.errorMessage = modelContainer.getStringValue("errorMessage");
    model.officeId = modelContainer.getIntValue("officeId");
    model.active = modelContainer.getBoolValue("active");
    model.activationDate = modelContainer.getStringValue("activationDate");
    model.submittedOnDate = modelContainer.getStringValue("submittedOnDate");
    model.externalId = modelContainer.getStringValue("externalId");
    model.name = modelContainer.getStringValue("name");
    model.locale = modelContainer.getStringValue("locale");
    model.dateFormat = modelContainer.getStringValue("dateFormat");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<GroupPayload, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexerrorMessage = cursor.getColumnIndex("errorMessage");
    if (indexerrorMessage != -1 && !cursor.isNull(indexerrorMessage)) {
      modelContainer.put("errorMessage", cursor.getString(indexerrorMessage));
    } else {
      modelContainer.putDefault("errorMessage");
    }
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      modelContainer.put("officeId", cursor.getInt(indexofficeId));
    } else {
      modelContainer.putDefault("officeId");
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      modelContainer.put("active", cursor.getInt(indexactive));
    } else {
      modelContainer.putDefault("active");
    }
    int indexactivationDate = cursor.getColumnIndex("activationDate");
    if (indexactivationDate != -1 && !cursor.isNull(indexactivationDate)) {
      modelContainer.put("activationDate", cursor.getString(indexactivationDate));
    } else {
      modelContainer.putDefault("activationDate");
    }
    int indexsubmittedOnDate = cursor.getColumnIndex("submittedOnDate");
    if (indexsubmittedOnDate != -1 && !cursor.isNull(indexsubmittedOnDate)) {
      modelContainer.put("submittedOnDate", cursor.getString(indexsubmittedOnDate));
    } else {
      modelContainer.putDefault("submittedOnDate");
    }
    int indexexternalId = cursor.getColumnIndex("externalId");
    if (indexexternalId != -1 && !cursor.isNull(indexexternalId)) {
      modelContainer.put("externalId", cursor.getString(indexexternalId));
    } else {
      modelContainer.putDefault("externalId");
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      modelContainer.put("name", cursor.getString(indexname));
    } else {
      modelContainer.putDefault("name");
    }
    int indexlocale = cursor.getColumnIndex("locale");
    if (indexlocale != -1 && !cursor.isNull(indexlocale)) {
      modelContainer.put("locale", cursor.getString(indexlocale));
    } else {
      modelContainer.putDefault("locale");
    }
    int indexdateFormat = cursor.getColumnIndex("dateFormat");
    if (indexdateFormat != -1 && !cursor.isNull(indexdateFormat)) {
      modelContainer.put("dateFormat", cursor.getString(indexdateFormat));
    } else {
      modelContainer.putDefault("dateFormat");
    }
  }

  @Override
  public final ForeignKeyContainer<GroupPayload> toForeignKeyContainer(GroupPayload model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(GroupPayload.class);
    modelContainer.put(GroupPayload_Table.id, model.id);
    return modelContainer;
  }
}
