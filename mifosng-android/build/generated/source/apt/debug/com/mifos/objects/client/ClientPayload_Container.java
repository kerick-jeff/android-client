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
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class ClientPayload_Container extends ModelContainerAdapter<ClientPayload> {
  public ClientPayload_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", int.class);
    columnMap.put("errorMessage", String.class);
    columnMap.put("firstname", String.class);
    columnMap.put("lastname", String.class);
    columnMap.put("middlename", String.class);
    columnMap.put("officeId", int.class);
    columnMap.put("staffId", int.class);
    columnMap.put("genderId", int.class);
    columnMap.put("active", boolean.class);
    columnMap.put("activationDate", String.class);
    columnMap.put("submittedOnDate", String.class);
    columnMap.put("dateOfBirth", String.class);
    columnMap.put("mobileNo", String.class);
    columnMap.put("externalId", String.class);
    columnMap.put("clientTypeId", int.class);
    columnMap.put("clientClassificationId", int.class);
    columnMap.put("dateFormat", String.class);
    columnMap.put("locale", String.class);
  }

  @Override
  public final Class<ClientPayload> getModelClass() {
    return ClientPayload.class;
  }

  public final String getTableName() {
    return "`ClientPayload`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<ClientPayload, ?> modelContainer) {
    String modelContainererrorMessage = modelContainer.getStringValue("errorMessage");
    if (modelContainererrorMessage != null) {
      values.put(ClientPayload_Table.errorMessage.getCursorKey(), modelContainererrorMessage);
    } else {
      values.putNull(ClientPayload_Table.errorMessage.getCursorKey());
    }
    String modelContainerfirstname = modelContainer.getStringValue("firstname");
    if (modelContainerfirstname != null) {
      values.put(ClientPayload_Table.firstname.getCursorKey(), modelContainerfirstname);
    } else {
      values.putNull(ClientPayload_Table.firstname.getCursorKey());
    }
    String modelContainerlastname = modelContainer.getStringValue("lastname");
    if (modelContainerlastname != null) {
      values.put(ClientPayload_Table.lastname.getCursorKey(), modelContainerlastname);
    } else {
      values.putNull(ClientPayload_Table.lastname.getCursorKey());
    }
    String modelContainermiddlename = modelContainer.getStringValue("middlename");
    if (modelContainermiddlename != null) {
      values.put(ClientPayload_Table.middlename.getCursorKey(), modelContainermiddlename);
    } else {
      values.putNull(ClientPayload_Table.middlename.getCursorKey());
    }
    values.put(ClientPayload_Table.officeId.getCursorKey(), modelContainer.getIntValue("officeId"));
    values.put(ClientPayload_Table.staffId.getCursorKey(), modelContainer.getIntValue("staffId"));
    values.put(ClientPayload_Table.genderId.getCursorKey(), modelContainer.getIntValue("genderId"));
    values.put(ClientPayload_Table.active.getCursorKey(), modelContainer.getBoolValue("active"));
    String modelContaineractivationDate = modelContainer.getStringValue("activationDate");
    if (modelContaineractivationDate != null) {
      values.put(ClientPayload_Table.activationDate.getCursorKey(), modelContaineractivationDate);
    } else {
      values.putNull(ClientPayload_Table.activationDate.getCursorKey());
    }
    String modelContainersubmittedOnDate = modelContainer.getStringValue("submittedOnDate");
    if (modelContainersubmittedOnDate != null) {
      values.put(ClientPayload_Table.submittedOnDate.getCursorKey(), modelContainersubmittedOnDate);
    } else {
      values.putNull(ClientPayload_Table.submittedOnDate.getCursorKey());
    }
    String modelContainerdateOfBirth = modelContainer.getStringValue("dateOfBirth");
    if (modelContainerdateOfBirth != null) {
      values.put(ClientPayload_Table.dateOfBirth.getCursorKey(), modelContainerdateOfBirth);
    } else {
      values.putNull(ClientPayload_Table.dateOfBirth.getCursorKey());
    }
    String modelContainermobileNo = modelContainer.getStringValue("mobileNo");
    if (modelContainermobileNo != null) {
      values.put(ClientPayload_Table.mobileNo.getCursorKey(), modelContainermobileNo);
    } else {
      values.putNull(ClientPayload_Table.mobileNo.getCursorKey());
    }
    String modelContainerexternalId = modelContainer.getStringValue("externalId");
    if (modelContainerexternalId != null) {
      values.put(ClientPayload_Table.externalId.getCursorKey(), modelContainerexternalId);
    } else {
      values.putNull(ClientPayload_Table.externalId.getCursorKey());
    }
    values.put(ClientPayload_Table.clientTypeId.getCursorKey(), modelContainer.getIntValue("clientTypeId"));
    values.put(ClientPayload_Table.clientClassificationId.getCursorKey(), modelContainer.getIntValue("clientClassificationId"));
    String modelContainerdateFormat = modelContainer.getStringValue("dateFormat");
    if (modelContainerdateFormat != null) {
      values.put(ClientPayload_Table.dateFormat.getCursorKey(), modelContainerdateFormat);
    } else {
      values.putNull(ClientPayload_Table.dateFormat.getCursorKey());
    }
    String modelContainerlocale = modelContainer.getStringValue("locale");
    if (modelContainerlocale != null) {
      values.put(ClientPayload_Table.locale.getCursorKey(), modelContainerlocale);
    } else {
      values.putNull(ClientPayload_Table.locale.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<ClientPayload, ?> modelContainer) {
    values.put(ClientPayload_Table.id.getCursorKey(), modelContainer.getIntValue("id"));
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<ClientPayload, ?> modelContainer, int start) {
    String modelContainererrorMessage = modelContainer.getStringValue("errorMessage");
    if (modelContainererrorMessage != null) {
      statement.bindString(1 + start, modelContainererrorMessage);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContainerfirstname = modelContainer.getStringValue("firstname");
    if (modelContainerfirstname != null) {
      statement.bindString(2 + start, modelContainerfirstname);
    } else {
      statement.bindNull(2 + start);
    }
    String modelContainerlastname = modelContainer.getStringValue("lastname");
    if (modelContainerlastname != null) {
      statement.bindString(3 + start, modelContainerlastname);
    } else {
      statement.bindNull(3 + start);
    }
    String modelContainermiddlename = modelContainer.getStringValue("middlename");
    if (modelContainermiddlename != null) {
      statement.bindString(4 + start, modelContainermiddlename);
    } else {
      statement.bindNull(4 + start);
    }
    statement.bindLong(5 + start, modelContainer.getIntValue("officeId"));
    statement.bindLong(6 + start, modelContainer.getIntValue("staffId"));
    statement.bindLong(7 + start, modelContainer.getIntValue("genderId"));
    statement.bindLong(8 + start, modelContainer.getBoolValue("active") ? 1 : 0);
    String modelContaineractivationDate = modelContainer.getStringValue("activationDate");
    if (modelContaineractivationDate != null) {
      statement.bindString(9 + start, modelContaineractivationDate);
    } else {
      statement.bindNull(9 + start);
    }
    String modelContainersubmittedOnDate = modelContainer.getStringValue("submittedOnDate");
    if (modelContainersubmittedOnDate != null) {
      statement.bindString(10 + start, modelContainersubmittedOnDate);
    } else {
      statement.bindNull(10 + start);
    }
    String modelContainerdateOfBirth = modelContainer.getStringValue("dateOfBirth");
    if (modelContainerdateOfBirth != null) {
      statement.bindString(11 + start, modelContainerdateOfBirth);
    } else {
      statement.bindNull(11 + start);
    }
    String modelContainermobileNo = modelContainer.getStringValue("mobileNo");
    if (modelContainermobileNo != null) {
      statement.bindString(12 + start, modelContainermobileNo);
    } else {
      statement.bindNull(12 + start);
    }
    String modelContainerexternalId = modelContainer.getStringValue("externalId");
    if (modelContainerexternalId != null) {
      statement.bindString(13 + start, modelContainerexternalId);
    } else {
      statement.bindNull(13 + start);
    }
    statement.bindLong(14 + start, modelContainer.getIntValue("clientTypeId"));
    statement.bindLong(15 + start, modelContainer.getIntValue("clientClassificationId"));
    String modelContainerdateFormat = modelContainer.getStringValue("dateFormat");
    if (modelContainerdateFormat != null) {
      statement.bindString(16 + start, modelContainerdateFormat);
    } else {
      statement.bindNull(16 + start);
    }
    String modelContainerlocale = modelContainer.getStringValue("locale");
    if (modelContainerlocale != null) {
      statement.bindString(17 + start, modelContainerlocale);
    } else {
      statement.bindNull(17 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<ClientPayload, ?> modelContainer) {
    statement.bindLong(1, modelContainer.getIntValue("id"));
    bindToInsertStatement(statement, modelContainer, 1);
  }

  @Override
  public final boolean exists(ModelContainer<ClientPayload, ?> modelContainer, DatabaseWrapper wrapper) {
    return modelContainer.getIntValue("id") > 0 && new Select(Method.count()).from(ClientPayload.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<ClientPayload, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(ClientPayload_Table.id.eq(modelContainer.getIntValue("id")));return clause;
  }

  @Override
  public final ClientPayload toModel(ModelContainer<ClientPayload, ?> modelContainer) {
    ClientPayload model = new ClientPayload();
    model.id = modelContainer.getIntValue("id");
    model.errorMessage = modelContainer.getStringValue("errorMessage");
    model.firstname = modelContainer.getStringValue("firstname");
    model.lastname = modelContainer.getStringValue("lastname");
    model.middlename = modelContainer.getStringValue("middlename");
    model.officeId = modelContainer.getIntValue("officeId");
    model.staffId = modelContainer.getIntValue("staffId");
    model.genderId = modelContainer.getIntValue("genderId");
    model.active = modelContainer.getBoolValue("active");
    model.activationDate = modelContainer.getStringValue("activationDate");
    model.submittedOnDate = modelContainer.getStringValue("submittedOnDate");
    model.dateOfBirth = modelContainer.getStringValue("dateOfBirth");
    model.mobileNo = modelContainer.getStringValue("mobileNo");
    model.externalId = modelContainer.getStringValue("externalId");
    model.clientTypeId = modelContainer.getIntValue("clientTypeId");
    model.clientClassificationId = modelContainer.getIntValue("clientClassificationId");
    model.dateFormat = modelContainer.getStringValue("dateFormat");
    model.locale = modelContainer.getStringValue("locale");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<ClientPayload, ?> modelContainer) {
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
    int indexfirstname = cursor.getColumnIndex("firstname");
    if (indexfirstname != -1 && !cursor.isNull(indexfirstname)) {
      modelContainer.put("firstname", cursor.getString(indexfirstname));
    } else {
      modelContainer.putDefault("firstname");
    }
    int indexlastname = cursor.getColumnIndex("lastname");
    if (indexlastname != -1 && !cursor.isNull(indexlastname)) {
      modelContainer.put("lastname", cursor.getString(indexlastname));
    } else {
      modelContainer.putDefault("lastname");
    }
    int indexmiddlename = cursor.getColumnIndex("middlename");
    if (indexmiddlename != -1 && !cursor.isNull(indexmiddlename)) {
      modelContainer.put("middlename", cursor.getString(indexmiddlename));
    } else {
      modelContainer.putDefault("middlename");
    }
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      modelContainer.put("officeId", cursor.getInt(indexofficeId));
    } else {
      modelContainer.putDefault("officeId");
    }
    int indexstaffId = cursor.getColumnIndex("staffId");
    if (indexstaffId != -1 && !cursor.isNull(indexstaffId)) {
      modelContainer.put("staffId", cursor.getInt(indexstaffId));
    } else {
      modelContainer.putDefault("staffId");
    }
    int indexgenderId = cursor.getColumnIndex("genderId");
    if (indexgenderId != -1 && !cursor.isNull(indexgenderId)) {
      modelContainer.put("genderId", cursor.getInt(indexgenderId));
    } else {
      modelContainer.putDefault("genderId");
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
    int indexdateOfBirth = cursor.getColumnIndex("dateOfBirth");
    if (indexdateOfBirth != -1 && !cursor.isNull(indexdateOfBirth)) {
      modelContainer.put("dateOfBirth", cursor.getString(indexdateOfBirth));
    } else {
      modelContainer.putDefault("dateOfBirth");
    }
    int indexmobileNo = cursor.getColumnIndex("mobileNo");
    if (indexmobileNo != -1 && !cursor.isNull(indexmobileNo)) {
      modelContainer.put("mobileNo", cursor.getString(indexmobileNo));
    } else {
      modelContainer.putDefault("mobileNo");
    }
    int indexexternalId = cursor.getColumnIndex("externalId");
    if (indexexternalId != -1 && !cursor.isNull(indexexternalId)) {
      modelContainer.put("externalId", cursor.getString(indexexternalId));
    } else {
      modelContainer.putDefault("externalId");
    }
    int indexclientTypeId = cursor.getColumnIndex("clientTypeId");
    if (indexclientTypeId != -1 && !cursor.isNull(indexclientTypeId)) {
      modelContainer.put("clientTypeId", cursor.getInt(indexclientTypeId));
    } else {
      modelContainer.putDefault("clientTypeId");
    }
    int indexclientClassificationId = cursor.getColumnIndex("clientClassificationId");
    if (indexclientClassificationId != -1 && !cursor.isNull(indexclientClassificationId)) {
      modelContainer.put("clientClassificationId", cursor.getInt(indexclientClassificationId));
    } else {
      modelContainer.putDefault("clientClassificationId");
    }
    int indexdateFormat = cursor.getColumnIndex("dateFormat");
    if (indexdateFormat != -1 && !cursor.isNull(indexdateFormat)) {
      modelContainer.put("dateFormat", cursor.getString(indexdateFormat));
    } else {
      modelContainer.putDefault("dateFormat");
    }
    int indexlocale = cursor.getColumnIndex("locale");
    if (indexlocale != -1 && !cursor.isNull(indexlocale)) {
      modelContainer.put("locale", cursor.getString(indexlocale));
    } else {
      modelContainer.putDefault("locale");
    }
  }

  @Override
  public final ForeignKeyContainer<ClientPayload> toForeignKeyContainer(ClientPayload model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(ClientPayload.class);
    modelContainer.put(ClientPayload_Table.id, model.id);
    return modelContainer;
  }
}
