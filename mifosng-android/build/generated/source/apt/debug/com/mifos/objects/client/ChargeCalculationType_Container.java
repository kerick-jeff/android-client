package com.mifos.objects.client;

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
public final class ChargeCalculationType_Container extends ModelContainerAdapter<ChargeCalculationType> {
  public ChargeCalculationType_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("code", String.class);
    columnMap.put("value", String.class);
  }

  @Override
  public final Class<ChargeCalculationType> getModelClass() {
    return ChargeCalculationType.class;
  }

  public final String getTableName() {
    return "`ChargeCalculationType`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<ChargeCalculationType, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(ChargeCalculationType_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(ChargeCalculationType_Table.id.getCursorKey());
    }
    String modelContainercode = modelContainer.getStringValue("code");
    if (modelContainercode != null) {
      values.put(ChargeCalculationType_Table.code.getCursorKey(), modelContainercode);
    } else {
      values.putNull(ChargeCalculationType_Table.code.getCursorKey());
    }
    String modelContainervalue = modelContainer.getStringValue("value");
    if (modelContainervalue != null) {
      values.put(ChargeCalculationType_Table.value.getCursorKey(), modelContainervalue);
    } else {
      values.putNull(ChargeCalculationType_Table.value.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<ChargeCalculationType, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<ChargeCalculationType, ?> modelContainer, int start) {
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
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<ChargeCalculationType, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<ChargeCalculationType, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(ChargeCalculationType.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<ChargeCalculationType, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(ChargeCalculationType_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final ChargeCalculationType toModel(ModelContainer<ChargeCalculationType, ?> modelContainer) {
    ChargeCalculationType model = new ChargeCalculationType();
    model.id = modelContainer.getIntegerValue("id");
    model.code = modelContainer.getStringValue("code");
    model.value = modelContainer.getStringValue("value");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<ChargeCalculationType, ?> modelContainer) {
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
  public final ForeignKeyContainer<ChargeCalculationType> toForeignKeyContainer(ChargeCalculationType model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(ChargeCalculationType.class);
    modelContainer.put(ChargeCalculationType_Table.id, model.id);
    return modelContainer;
  }
}
