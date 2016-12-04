package com.mifos.objects.templates.clients;

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

public final class ClientsTemplate_Adapter extends ModelAdapter<ClientsTemplate> {
  public ClientsTemplate_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<ClientsTemplate> getModelClass() {
    return ClientsTemplate.class;
  }

  public final String getTableName() {
    return "`ClientsTemplate`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ClientsTemplate_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ClientsTemplate model) {
    values.put(ClientsTemplate_Table.officeId.getCursorKey(), model.officeId);
  }

  @Override
  public final void bindToContentValues(ContentValues values, ClientsTemplate model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ClientsTemplate model, int start) {
    statement.bindLong(1 + start, model.officeId);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ClientsTemplate model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ClientsTemplate`(`officeId`) VALUES (?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ClientsTemplate`(`officeId`) VALUES (?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ClientsTemplate`(`officeId` INTEGER, PRIMARY KEY(`officeId`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ClientsTemplate model) {
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      model.officeId = cursor.getInt(indexofficeId);
    } else {
      model.officeId = 0;
    }
  }

  @Override
  public final boolean exists(ClientsTemplate model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(ClientsTemplate.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ClientsTemplate model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(ClientsTemplate_Table.officeId.eq(model.officeId));return clause;
  }

  @Override
  public final ClientsTemplate newInstance() {
    return new ClientsTemplate();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return ClientsTemplate_Table.getProperty(name);
  }
}
