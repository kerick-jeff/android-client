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
public final class Options_Container extends ModelContainerAdapter<Options> {
  public Options_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("genderOptions", String.class);
    columnMap.put("clientTypeOptions", String.class);
    columnMap.put("clientClassificationOptions", String.class);
    columnMap.put("id", int.class);
    columnMap.put("name", String.class);
    columnMap.put("position", int.class);
    columnMap.put("description", String.class);
    columnMap.put("activeStatus", boolean.class);
  }

  @Override
  public final Class<Options> getModelClass() {
    return Options.class;
  }

  public final String getTableName() {
    return "`ClientTemplateOptions`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Options, ?> modelContainer) {
    String modelContainergenderOptions = modelContainer.getStringValue("genderOptions");
    if (modelContainergenderOptions != null) {
      values.put(Options_Table.genderOptions.getCursorKey(), modelContainergenderOptions);
    } else {
      values.putNull(Options_Table.genderOptions.getCursorKey());
    }
    String modelContainerclientTypeOptions = modelContainer.getStringValue("clientTypeOptions");
    if (modelContainerclientTypeOptions != null) {
      values.put(Options_Table.clientTypeOptions.getCursorKey(), modelContainerclientTypeOptions);
    } else {
      values.putNull(Options_Table.clientTypeOptions.getCursorKey());
    }
    String modelContainerclientClassificationOptions = modelContainer.getStringValue("clientClassificationOptions");
    if (modelContainerclientClassificationOptions != null) {
      values.put(Options_Table.clientClassificationOptions.getCursorKey(), modelContainerclientClassificationOptions);
    } else {
      values.putNull(Options_Table.clientClassificationOptions.getCursorKey());
    }
    values.put(Options_Table.id.getCursorKey(), modelContainer.getIntValue("id"));
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      values.put(Options_Table.name.getCursorKey(), modelContainername);
    } else {
      values.putNull(Options_Table.name.getCursorKey());
    }
    values.put(Options_Table.position.getCursorKey(), modelContainer.getIntValue("position"));
    String modelContainerdescription = modelContainer.getStringValue("description");
    if (modelContainerdescription != null) {
      values.put(Options_Table.description.getCursorKey(), modelContainerdescription);
    } else {
      values.putNull(Options_Table.description.getCursorKey());
    }
    values.put(Options_Table.activeStatus.getCursorKey(), modelContainer.getBoolValue("activeStatus"));
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Options, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Options, ?> modelContainer, int start) {
    String modelContainergenderOptions = modelContainer.getStringValue("genderOptions");
    if (modelContainergenderOptions != null) {
      statement.bindString(1 + start, modelContainergenderOptions);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContainerclientTypeOptions = modelContainer.getStringValue("clientTypeOptions");
    if (modelContainerclientTypeOptions != null) {
      statement.bindString(2 + start, modelContainerclientTypeOptions);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainerclientClassificationOptions = modelContainer.getStringValue("clientClassificationOptions");
    if (modelContainerclientClassificationOptions != null) {
      statement.bindString(3 + start, modelContainerclientClassificationOptions);
    } else {
      statement.bindNull(3 + start);
    }
    statement.bindLong(4 + start, modelContainer.getIntValue("id"));
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      statement.bindString(5 + start, modelContainername);
    } else {
      statement.bindNull(5 + start);
    }
    statement.bindLong(6 + start, modelContainer.getIntValue("position"));
    String modelContainerdescription = modelContainer.getStringValue("description");
    if (modelContainerdescription != null) {
      statement.bindString(7 + start, modelContainerdescription);
    } else {
      statement.bindNull(7 + start);
    }
    statement.bindLong(8 + start, modelContainer.getBoolValue("activeStatus") ? 1 : 0);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Options, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Options, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Options.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Options, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Options_Table.id.eq(modelContainer.getIntValue("id")));return clause;
  }

  @Override
  public final Options toModel(ModelContainer<Options, ?> modelContainer) {
    Options model = new Options();
    model.genderOptions = modelContainer.getStringValue("genderOptions");
    model.clientTypeOptions = modelContainer.getStringValue("clientTypeOptions");
    model.clientClassificationOptions = modelContainer.getStringValue("clientClassificationOptions");
    model.id = modelContainer.getIntValue("id");
    model.name = modelContainer.getStringValue("name");
    model.position = modelContainer.getIntValue("position");
    model.description = modelContainer.getStringValue("description");
    model.activeStatus = modelContainer.getBoolValue("activeStatus");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Options, ?> modelContainer) {
    int indexgenderOptions = cursor.getColumnIndex("genderOptions");
    if (indexgenderOptions != -1 && !cursor.isNull(indexgenderOptions)) {
      modelContainer.put("genderOptions", cursor.getString(indexgenderOptions));
    } else {
      modelContainer.putDefault("genderOptions");
    }
    int indexclientTypeOptions = cursor.getColumnIndex("clientTypeOptions");
    if (indexclientTypeOptions != -1 && !cursor.isNull(indexclientTypeOptions)) {
      modelContainer.put("clientTypeOptions", cursor.getString(indexclientTypeOptions));
    } else {
      modelContainer.putDefault("clientTypeOptions");
    }
    int indexclientClassificationOptions = cursor.getColumnIndex("clientClassificationOptions");
    if (indexclientClassificationOptions != -1 && !cursor.isNull(indexclientClassificationOptions)) {
      modelContainer.put("clientClassificationOptions", cursor.getString(indexclientClassificationOptions));
    } else {
      modelContainer.putDefault("clientClassificationOptions");
    }
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      modelContainer.put("name", cursor.getString(indexname));
    } else {
      modelContainer.putDefault("name");
    }
    int indexposition = cursor.getColumnIndex("position");
    if (indexposition != -1 && !cursor.isNull(indexposition)) {
      modelContainer.put("position", cursor.getInt(indexposition));
    } else {
      modelContainer.putDefault("position");
    }
    int indexdescription = cursor.getColumnIndex("description");
    if (indexdescription != -1 && !cursor.isNull(indexdescription)) {
      modelContainer.put("description", cursor.getString(indexdescription));
    } else {
      modelContainer.putDefault("description");
    }
    int indexactiveStatus = cursor.getColumnIndex("activeStatus");
    if (indexactiveStatus != -1 && !cursor.isNull(indexactiveStatus)) {
      modelContainer.put("activeStatus", cursor.getInt(indexactiveStatus));
    } else {
      modelContainer.putDefault("activeStatus");
    }
  }

  @Override
  public final ForeignKeyContainer<Options> toForeignKeyContainer(Options model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Options.class);
    modelContainer.put(Options_Table.id, model.id);
    return modelContainer;
  }
}
