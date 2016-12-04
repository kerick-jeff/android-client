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
public final class ClientsTemplate_Container extends ModelContainerAdapter<ClientsTemplate> {
  public ClientsTemplate_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("officeId", int.class);
  }

  @Override
  public final Class<ClientsTemplate> getModelClass() {
    return ClientsTemplate.class;
  }

  public final String getTableName() {
    return "`ClientsTemplate`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<ClientsTemplate, ?> modelContainer) {
    values.put(ClientsTemplate_Table.officeId.getCursorKey(), modelContainer.getIntValue("officeId"));
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<ClientsTemplate, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<ClientsTemplate, ?> modelContainer, int start) {
    statement.bindLong(1 + start, modelContainer.getIntValue("officeId"));
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<ClientsTemplate, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<ClientsTemplate, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(ClientsTemplate.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<ClientsTemplate, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(ClientsTemplate_Table.officeId.eq(modelContainer.getIntValue("officeId")));return clause;
  }

  @Override
  public final ClientsTemplate toModel(ModelContainer<ClientsTemplate, ?> modelContainer) {
    ClientsTemplate model = new ClientsTemplate();
    model.officeId = modelContainer.getIntValue("officeId");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<ClientsTemplate, ?> modelContainer) {
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      modelContainer.put("officeId", cursor.getInt(indexofficeId));
    } else {
      modelContainer.putDefault("officeId");
    }
  }

  @Override
  public final ForeignKeyContainer<ClientsTemplate> toForeignKeyContainer(ClientsTemplate model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(ClientsTemplate.class);
    modelContainer.put(ClientsTemplate_Table.officeId, model.officeId);
    return modelContainer;
  }
}
