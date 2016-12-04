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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class InterestType_Container extends ModelContainerAdapter<InterestType> {
  public InterestType_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("code", String.class);
    columnMap.put("value", String.class);
  }

  @Override
  public final Class<InterestType> getModelClass() {
    return InterestType.class;
  }

  public final String getTableName() {
    return "`ClientTemplateInterest`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<InterestType, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(InterestType_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(InterestType_Table.id.getCursorKey());
    }
    String modelContainercode = modelContainer.getStringValue("code");
    if (modelContainercode != null) {
      values.put(InterestType_Table.code.getCursorKey(), modelContainercode);
    } else {
      values.putNull(InterestType_Table.code.getCursorKey());
    }
    String modelContainervalue = modelContainer.getStringValue("value");
    if (modelContainervalue != null) {
      values.put(InterestType_Table.value.getCursorKey(), modelContainervalue);
    } else {
      values.putNull(InterestType_Table.value.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<InterestType, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<InterestType, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContainercode = modelContainer.getStringValue("code");
    if (modelContainercode != null) {
      statement.bindString(2 + start, modelContainercode);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainervalue = modelContainer.getStringValue("value");
    if (modelContainervalue != null) {
      statement.bindString(3 + start, modelContainervalue);
    } else {
      statement.bindNull(3 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<InterestType, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<InterestType, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(InterestType.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<InterestType, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(InterestType_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final InterestType toModel(ModelContainer<InterestType, ?> modelContainer) {
    InterestType model = new InterestType();
    model.id = modelContainer.getIntegerValue("id");
    model.code = modelContainer.getStringValue("code");
    model.value = modelContainer.getStringValue("value");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<InterestType, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexcode = cursor.getColumnIndex("code");
    if (indexcode != -1 && !cursor.isNull(indexcode)) {
      modelContainer.put("code", cursor.getString(indexcode));
    } else {
      modelContainer.putDefault("code");
    }
    int indexvalue = cursor.getColumnIndex("value");
    if (indexvalue != -1 && !cursor.isNull(indexvalue)) {
      modelContainer.put("value", cursor.getString(indexvalue));
    } else {
      modelContainer.putDefault("value");
    }
  }

  @Override
  public final ForeignKeyContainer<InterestType> toForeignKeyContainer(InterestType model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(InterestType.class);
    modelContainer.put(InterestType_Table.id, model.id);
    return modelContainer;
  }
}
