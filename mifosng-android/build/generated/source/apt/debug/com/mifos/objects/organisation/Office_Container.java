package com.mifos.objects.organisation;

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
public final class Office_Container extends ModelContainerAdapter<Office> {
  public Office_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", Integer.class);
    columnMap.put("externalId", String.class);
    columnMap.put("name", String.class);
    columnMap.put("nameDecorated", String.class);
    columnMap.put("officeOpeningDate", OfficeOpeningDate.class);
  }

  @Override
  public final Class<Office> getModelClass() {
    return Office.class;
  }

  public final String getTableName() {
    return "`Office`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Office, ?> modelContainer) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      values.put(Office_Table.id.getCursorKey(), modelContainerid);
    } else {
      values.putNull(Office_Table.id.getCursorKey());
    }
    String modelContainerexternalId = modelContainer.getStringValue("externalId");
    if (modelContainerexternalId != null) {
      values.put(Office_Table.externalId.getCursorKey(), modelContainerexternalId);
    } else {
      values.putNull(Office_Table.externalId.getCursorKey());
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      values.put(Office_Table.name.getCursorKey(), modelContainername);
    } else {
      values.putNull(Office_Table.name.getCursorKey());
    }
    String modelContainernameDecorated = modelContainer.getStringValue("nameDecorated");
    if (modelContainernameDecorated != null) {
      values.put(Office_Table.nameDecorated.getCursorKey(), modelContainernameDecorated);
    } else {
      values.putNull(Office_Table.nameDecorated.getCursorKey());
    }
    ModelContainer<OfficeOpeningDate, ?> refofficeOpeningDate = modelContainer.getInstance(modelContainer.getValue("officeOpeningDate"), com.mifos.objects.organisation.OfficeOpeningDate.class);
    if (refofficeOpeningDate != null) {
      refofficeOpeningDate.save();
      values.put(Office_Table.officeOpeningDate_officeId.getCursorKey(), refofficeOpeningDate.getIntValue("officeId"));
    } else {
      values.putNull("`officeOpeningDate_officeId`");
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Office, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Office, ?> modelContainer, int start) {
    Integer modelContainerid = modelContainer.getIntegerValue("id");
    if (modelContainerid != null) {
      statement.bindLong(1 + start, modelContainerid);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContainerexternalId = modelContainer.getStringValue("externalId");
    if (modelContainerexternalId != null) {
      statement.bindString(2 + start, modelContainerexternalId);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      statement.bindString(3 + start, modelContainername);
    } else {
      statement.bindNull(3 + start);
    }
    String modelContainernameDecorated = modelContainer.getStringValue("nameDecorated");
    if (modelContainernameDecorated != null) {
      statement.bindString(4 + start, modelContainernameDecorated);
    } else {
      statement.bindNull(4 + start);
    }
    ModelContainer<OfficeOpeningDate, ?> refofficeOpeningDate = modelContainer.getInstance(modelContainer.getValue("officeOpeningDate"), com.mifos.objects.organisation.OfficeOpeningDate.class);
    if (refofficeOpeningDate != null) {
      refofficeOpeningDate.save();
      statement.bindLong(5 + start, refofficeOpeningDate.getIntValue("officeId"));
    } else {
      statement.bindNull(5 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Office, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Office, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Office.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Office, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Office_Table.id.eq(modelContainer.getIntegerValue("id")));return clause;
  }

  @Override
  public final Office toModel(ModelContainer<Office, ?> modelContainer) {
    Office model = new Office();
    model.id = modelContainer.getIntegerValue("id");
    model.externalId = modelContainer.getStringValue("externalId");
    model.name = modelContainer.getStringValue("name");
    model.nameDecorated = modelContainer.getStringValue("nameDecorated");
    ModelContainer<OfficeOpeningDate, ?> refofficeOpeningDate = modelContainer.getInstance(modelContainer.getValue("officeOpeningDate"), com.mifos.objects.organisation.OfficeOpeningDate.class);
    if (refofficeOpeningDate != null) {
      model.officeOpeningDate = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.organisation.OfficeOpeningDate.class).toModel(refofficeOpeningDate);
    }
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Office, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
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
    int indexnameDecorated = cursor.getColumnIndex("nameDecorated");
    if (indexnameDecorated != -1 && !cursor.isNull(indexnameDecorated)) {
      modelContainer.put("nameDecorated", cursor.getString(indexnameDecorated));
    } else {
      modelContainer.putDefault("nameDecorated");
    }
    //// Only load model if references match, for efficiency
    int indexofficeOpeningDate_officeId = cursor.getColumnIndex("officeOpeningDate_officeId");
    if (indexofficeOpeningDate_officeId != -1 && !cursor.isNull(indexofficeOpeningDate_officeId)) {
      modelContainer.put("officeOpeningDate", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.organisation.OfficeOpeningDate.class).where()
          .and(com.mifos.objects.organisation.OfficeOpeningDate_Table.officeId.eq(cursor.getInt(indexofficeOpeningDate_officeId))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.organisation.OfficeOpeningDate.class)).getData());
    } else {
      modelContainer.putDefault("officeOpeningDate");
    }
  }

  @Override
  public final ForeignKeyContainer<Office> toForeignKeyContainer(Office model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Office.class);
    modelContainer.put(Office_Table.id, model.id);
    return modelContainer;
  }
}
