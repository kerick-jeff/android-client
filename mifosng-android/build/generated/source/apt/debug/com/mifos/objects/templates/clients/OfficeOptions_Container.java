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
public final class OfficeOptions_Container extends ModelContainerAdapter<OfficeOptions> {
  public OfficeOptions_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", int.class);
    columnMap.put("name", String.class);
    columnMap.put("nameDecorated", String.class);
  }

  @Override
  public final Class<OfficeOptions> getModelClass() {
    return OfficeOptions.class;
  }

  public final String getTableName() {
    return "`ClientTemplateOfficeOptions`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<OfficeOptions, ?> modelContainer) {
    values.put(OfficeOptions_Table.id.getCursorKey(), modelContainer.getIntValue("id"));
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      values.put(OfficeOptions_Table.name.getCursorKey(), modelContainername);
    } else {
      values.putNull(OfficeOptions_Table.name.getCursorKey());
    }
    String modelContainernameDecorated = modelContainer.getStringValue("nameDecorated");
    if (modelContainernameDecorated != null) {
      values.put(OfficeOptions_Table.nameDecorated.getCursorKey(), modelContainernameDecorated);
    } else {
      values.putNull(OfficeOptions_Table.nameDecorated.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<OfficeOptions, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<OfficeOptions, ?> modelContainer, int start) {
    statement.bindLong(1 + start, modelContainer.getIntValue("id"));
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      statement.bindString(2 + start, modelContainername);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainernameDecorated = modelContainer.getStringValue("nameDecorated");
    if (modelContainernameDecorated != null) {
      statement.bindString(3 + start, modelContainernameDecorated);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<OfficeOptions, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<OfficeOptions, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(OfficeOptions.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<OfficeOptions, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(OfficeOptions_Table.id.eq(modelContainer.getIntValue("id")));return clause;
  }

  @Override
  public final OfficeOptions toModel(ModelContainer<OfficeOptions, ?> modelContainer) {
    OfficeOptions model = new OfficeOptions();
    model.id = modelContainer.getIntValue("id");
    model.name = modelContainer.getStringValue("name");
    model.nameDecorated = modelContainer.getStringValue("nameDecorated");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<OfficeOptions, ?> modelContainer) {
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
    int indexnameDecorated = cursor.getColumnIndex("nameDecorated");
    if (indexnameDecorated != -1 && !cursor.isNull(indexnameDecorated)) {
      modelContainer.put("nameDecorated", cursor.getString(indexnameDecorated));
    } else {
      modelContainer.putDefault("nameDecorated");
    }
  }

  @Override
  public final ForeignKeyContainer<OfficeOptions> toForeignKeyContainer(OfficeOptions model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(OfficeOptions.class);
    modelContainer.put(OfficeOptions_Table.id, model.id);
    return modelContainer;
  }
}
