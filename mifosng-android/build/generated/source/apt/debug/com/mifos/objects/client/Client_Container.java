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
public final class Client_Container extends ModelContainerAdapter<Client> {
  public Client_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("id", int.class);
    columnMap.put("groupId", int.class);
    columnMap.put("accountNo", String.class);
    columnMap.put("status", Status.class);
    columnMap.put("sync", boolean.class);
    columnMap.put("active", boolean.class);
    columnMap.put("clientDate", ClientDate.class);
    columnMap.put("firstname", String.class);
    columnMap.put("middlename", String.class);
    columnMap.put("lastname", String.class);
    columnMap.put("displayName", String.class);
    columnMap.put("officeId", int.class);
    columnMap.put("officeName", String.class);
    columnMap.put("staffId", int.class);
    columnMap.put("staffName", String.class);
    columnMap.put("fullname", String.class);
    columnMap.put("imageId", int.class);
    columnMap.put("imagePresent", boolean.class);
    columnMap.put("externalId", String.class);
  }

  @Override
  public final Class<Client> getModelClass() {
    return Client.class;
  }

  public final String getTableName() {
    return "`Client`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Client, ?> modelContainer) {
    values.put(Client_Table.id.getCursorKey(), modelContainer.getIntValue("id"));
    values.put(Client_Table.groupId.getCursorKey(), modelContainer.getIntValue("groupId"));
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      values.put(Client_Table.accountNo.getCursorKey(), modelContaineraccountNo);
    } else {
      values.putNull(Client_Table.accountNo.getCursorKey());
    }
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.client.Status.class);
    if (refstatus != null) {
      refstatus.save();
      values.put(Client_Table.status_id.getCursorKey(), refstatus.getIntValue("id"));
    } else {
      values.putNull("`status_id`");
    }
    values.put(Client_Table.sync.getCursorKey(), modelContainer.getBoolValue("sync"));
    values.put(Client_Table.active.getCursorKey(), modelContainer.getBoolValue("active"));
    ModelContainer<ClientDate, ?> refclientDate = modelContainer.getInstance(modelContainer.getValue("clientDate"), com.mifos.objects.client.ClientDate.class);
    if (refclientDate != null) {
      refclientDate.save();
      values.put(Client_Table.clientDate_clientId.getCursorKey(), refclientDate.getLngValue("clientId"));
      values.put(Client_Table.clientDate_chargeId.getCursorKey(), refclientDate.getLngValue("chargeId"));
    } else {
      values.putNull("`clientDate_clientId`");
      values.putNull("`clientDate_chargeId`");
    }
    String modelContainerfirstname = modelContainer.getStringValue("firstname");
    if (modelContainerfirstname != null) {
      values.put(Client_Table.firstname.getCursorKey(), modelContainerfirstname);
    } else {
      values.putNull(Client_Table.firstname.getCursorKey());
    }
    String modelContainermiddlename = modelContainer.getStringValue("middlename");
    if (modelContainermiddlename != null) {
      values.put(Client_Table.middlename.getCursorKey(), modelContainermiddlename);
    } else {
      values.putNull(Client_Table.middlename.getCursorKey());
    }
    String modelContainerlastname = modelContainer.getStringValue("lastname");
    if (modelContainerlastname != null) {
      values.put(Client_Table.lastname.getCursorKey(), modelContainerlastname);
    } else {
      values.putNull(Client_Table.lastname.getCursorKey());
    }
    String modelContainerdisplayName = modelContainer.getStringValue("displayName");
    if (modelContainerdisplayName != null) {
      values.put(Client_Table.displayName.getCursorKey(), modelContainerdisplayName);
    } else {
      values.putNull(Client_Table.displayName.getCursorKey());
    }
    values.put(Client_Table.officeId.getCursorKey(), modelContainer.getIntValue("officeId"));
    String modelContainerofficeName = modelContainer.getStringValue("officeName");
    if (modelContainerofficeName != null) {
      values.put(Client_Table.officeName.getCursorKey(), modelContainerofficeName);
    } else {
      values.putNull(Client_Table.officeName.getCursorKey());
    }
    values.put(Client_Table.staffId.getCursorKey(), modelContainer.getIntValue("staffId"));
    String modelContainerstaffName = modelContainer.getStringValue("staffName");
    if (modelContainerstaffName != null) {
      values.put(Client_Table.staffName.getCursorKey(), modelContainerstaffName);
    } else {
      values.putNull(Client_Table.staffName.getCursorKey());
    }
    String modelContainerfullname = modelContainer.getStringValue("fullname");
    if (modelContainerfullname != null) {
      values.put(Client_Table.fullname.getCursorKey(), modelContainerfullname);
    } else {
      values.putNull(Client_Table.fullname.getCursorKey());
    }
    values.put(Client_Table.imageId.getCursorKey(), modelContainer.getIntValue("imageId"));
    values.put(Client_Table.imagePresent.getCursorKey(), modelContainer.getBoolValue("imagePresent"));
    String modelContainerexternalId = modelContainer.getStringValue("externalId");
    if (modelContainerexternalId != null) {
      values.put(Client_Table.externalId.getCursorKey(), modelContainerexternalId);
    } else {
      values.putNull(Client_Table.externalId.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Client, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Client, ?> modelContainer, int start) {
    statement.bindLong(1 + start, modelContainer.getIntValue("id"));
    statement.bindLong(2 + start, modelContainer.getIntValue("groupId"));
    String modelContaineraccountNo = modelContainer.getStringValue("accountNo");
    if (modelContaineraccountNo != null) {
      statement.bindString(3 + start, modelContaineraccountNo);
    } else {
      statement.bindNull(3 + start);
    }
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.client.Status.class);
    if (refstatus != null) {
      refstatus.save();
      statement.bindLong(4 + start, refstatus.getIntValue("id"));
    } else {
      statement.bindNull(4 + start);
    }
    statement.bindLong(5 + start, modelContainer.getBoolValue("sync") ? 1 : 0);
    statement.bindLong(6 + start, modelContainer.getBoolValue("active") ? 1 : 0);
    ModelContainer<ClientDate, ?> refclientDate = modelContainer.getInstance(modelContainer.getValue("clientDate"), com.mifos.objects.client.ClientDate.class);
    if (refclientDate != null) {
      refclientDate.save();
      statement.bindLong(7 + start, refclientDate.getLngValue("clientId"));
      statement.bindLong(8 + start, refclientDate.getLngValue("chargeId"));
    } else {
      statement.bindNull(7 + start);
      statement.bindNull(8 + start);
    }
    String modelContainerfirstname = modelContainer.getStringValue("firstname");
    if (modelContainerfirstname != null) {
      statement.bindString(9 + start, modelContainerfirstname);
    } else {
      statement.bindNull(9 + start);
    }
    String modelContainermiddlename = modelContainer.getStringValue("middlename");
    if (modelContainermiddlename != null) {
      statement.bindString(10 + start, modelContainermiddlename);
    } else {
      statement.bindNull(10 + start);
    }
    String modelContainerlastname = modelContainer.getStringValue("lastname");
    if (modelContainerlastname != null) {
      statement.bindString(11 + start, modelContainerlastname);
    } else {
      statement.bindNull(11 + start);
    }
    String modelContainerdisplayName = modelContainer.getStringValue("displayName");
    if (modelContainerdisplayName != null) {
      statement.bindString(12 + start, modelContainerdisplayName);
    } else {
      statement.bindNull(12 + start);
    }
    statement.bindLong(13 + start, modelContainer.getIntValue("officeId"));
    String modelContainerofficeName = modelContainer.getStringValue("officeName");
    if (modelContainerofficeName != null) {
      statement.bindString(14 + start, modelContainerofficeName);
    } else {
      statement.bindNull(14 + start);
    }
    statement.bindLong(15 + start, modelContainer.getIntValue("staffId"));
    String modelContainerstaffName = modelContainer.getStringValue("staffName");
    if (modelContainerstaffName != null) {
      statement.bindString(16 + start, modelContainerstaffName);
    } else {
      statement.bindNull(16 + start);
    }
    String modelContainerfullname = modelContainer.getStringValue("fullname");
    if (modelContainerfullname != null) {
      statement.bindString(17 + start, modelContainerfullname);
    } else {
      statement.bindNull(17 + start);
    }
    statement.bindLong(18 + start, modelContainer.getIntValue("imageId"));
    statement.bindLong(19 + start, modelContainer.getBoolValue("imagePresent") ? 1 : 0);
    String modelContainerexternalId = modelContainer.getStringValue("externalId");
    if (modelContainerexternalId != null) {
      statement.bindString(20 + start, modelContainerexternalId);
    } else {
      statement.bindNull(20 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Client, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Client, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Client.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Client, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Client_Table.id.eq(modelContainer.getIntValue("id")));return clause;
  }

  @Override
  public final Client toModel(ModelContainer<Client, ?> modelContainer) {
    Client model = new Client();
    model.id = modelContainer.getIntValue("id");
    model.groupId = modelContainer.getIntValue("groupId");
    model.accountNo = modelContainer.getStringValue("accountNo");
    ModelContainer<Status, ?> refstatus = modelContainer.getInstance(modelContainer.getValue("status"), com.mifos.objects.client.Status.class);
    if (refstatus != null) {
      model.status = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.client.Status.class).toModel(refstatus);
    }
    model.sync = modelContainer.getBoolValue("sync");
    model.active = modelContainer.getBoolValue("active");
    ModelContainer<ClientDate, ?> refclientDate = modelContainer.getInstance(modelContainer.getValue("clientDate"), com.mifos.objects.client.ClientDate.class);
    if (refclientDate != null) {
      model.clientDate = com.raizlabs.android.dbflow.config.FlowManager.getContainerAdapter(com.mifos.objects.client.ClientDate.class).toModel(refclientDate);
    }
    model.firstname = modelContainer.getStringValue("firstname");
    model.middlename = modelContainer.getStringValue("middlename");
    model.lastname = modelContainer.getStringValue("lastname");
    model.displayName = modelContainer.getStringValue("displayName");
    model.officeId = modelContainer.getIntValue("officeId");
    model.officeName = modelContainer.getStringValue("officeName");
    model.staffId = modelContainer.getIntValue("staffId");
    model.staffName = modelContainer.getStringValue("staffName");
    model.fullname = modelContainer.getStringValue("fullname");
    model.imageId = modelContainer.getIntValue("imageId");
    model.imagePresent = modelContainer.getBoolValue("imagePresent");
    model.setExternalId(modelContainer.getStringValue("externalId"));
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Client, ?> modelContainer) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      modelContainer.put("id", cursor.getInt(indexid));
    } else {
      modelContainer.putDefault("id");
    }
    int indexgroupId = cursor.getColumnIndex("groupId");
    if (indexgroupId != -1 && !cursor.isNull(indexgroupId)) {
      modelContainer.put("groupId", cursor.getInt(indexgroupId));
    } else {
      modelContainer.putDefault("groupId");
    }
    int indexaccountNo = cursor.getColumnIndex("accountNo");
    if (indexaccountNo != -1 && !cursor.isNull(indexaccountNo)) {
      modelContainer.put("accountNo", cursor.getString(indexaccountNo));
    } else {
      modelContainer.putDefault("accountNo");
    }
    //// Only load model if references match, for efficiency
    int indexstatus_id = cursor.getColumnIndex("status_id");
    if (indexstatus_id != -1 && !cursor.isNull(indexstatus_id)) {
      modelContainer.put("status", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.Status.class).where()
          .and(com.mifos.objects.client.Status_Table.id.eq(cursor.getInt(indexstatus_id))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.client.Status.class)).getData());
    } else {
      modelContainer.putDefault("status");
    }
    int indexsync = cursor.getColumnIndex("sync");
    if (indexsync != -1 && !cursor.isNull(indexsync)) {
      modelContainer.put("sync", cursor.getInt(indexsync));
    } else {
      modelContainer.putDefault("sync");
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      modelContainer.put("active", cursor.getInt(indexactive));
    } else {
      modelContainer.putDefault("active");
    }
    //// Only load model if references match, for efficiency
    int indexclientDate_clientId = cursor.getColumnIndex("clientDate_clientId");
    int indexclientDate_chargeId = cursor.getColumnIndex("clientDate_chargeId");
    if (indexclientDate_clientId != -1 && !cursor.isNull(indexclientDate_clientId) && indexclientDate_chargeId != -1 && !cursor.isNull(indexclientDate_chargeId)) {
      modelContainer.put("clientDate", new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.ClientDate.class).where()
          .and(com.mifos.objects.client.ClientDate_Table.clientId.eq(cursor.getLong(indexclientDate_clientId)))
          .and(com.mifos.objects.client.ClientDate_Table.chargeId.eq(cursor.getLong(indexclientDate_chargeId))).queryModelContainer(modelContainer.getInstance(modelContainer.newDataInstance(), com.mifos.objects.client.ClientDate.class)).getData());
    } else {
      modelContainer.putDefault("clientDate");
    }
    int indexfirstname = cursor.getColumnIndex("firstname");
    if (indexfirstname != -1 && !cursor.isNull(indexfirstname)) {
      modelContainer.put("firstname", cursor.getString(indexfirstname));
    } else {
      modelContainer.putDefault("firstname");
    }
    int indexmiddlename = cursor.getColumnIndex("middlename");
    if (indexmiddlename != -1 && !cursor.isNull(indexmiddlename)) {
      modelContainer.put("middlename", cursor.getString(indexmiddlename));
    } else {
      modelContainer.putDefault("middlename");
    }
    int indexlastname = cursor.getColumnIndex("lastname");
    if (indexlastname != -1 && !cursor.isNull(indexlastname)) {
      modelContainer.put("lastname", cursor.getString(indexlastname));
    } else {
      modelContainer.putDefault("lastname");
    }
    int indexdisplayName = cursor.getColumnIndex("displayName");
    if (indexdisplayName != -1 && !cursor.isNull(indexdisplayName)) {
      modelContainer.put("displayName", cursor.getString(indexdisplayName));
    } else {
      modelContainer.putDefault("displayName");
    }
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      modelContainer.put("officeId", cursor.getInt(indexofficeId));
    } else {
      modelContainer.putDefault("officeId");
    }
    int indexofficeName = cursor.getColumnIndex("officeName");
    if (indexofficeName != -1 && !cursor.isNull(indexofficeName)) {
      modelContainer.put("officeName", cursor.getString(indexofficeName));
    } else {
      modelContainer.putDefault("officeName");
    }
    int indexstaffId = cursor.getColumnIndex("staffId");
    if (indexstaffId != -1 && !cursor.isNull(indexstaffId)) {
      modelContainer.put("staffId", cursor.getInt(indexstaffId));
    } else {
      modelContainer.putDefault("staffId");
    }
    int indexstaffName = cursor.getColumnIndex("staffName");
    if (indexstaffName != -1 && !cursor.isNull(indexstaffName)) {
      modelContainer.put("staffName", cursor.getString(indexstaffName));
    } else {
      modelContainer.putDefault("staffName");
    }
    int indexfullname = cursor.getColumnIndex("fullname");
    if (indexfullname != -1 && !cursor.isNull(indexfullname)) {
      modelContainer.put("fullname", cursor.getString(indexfullname));
    } else {
      modelContainer.putDefault("fullname");
    }
    int indeximageId = cursor.getColumnIndex("imageId");
    if (indeximageId != -1 && !cursor.isNull(indeximageId)) {
      modelContainer.put("imageId", cursor.getInt(indeximageId));
    } else {
      modelContainer.putDefault("imageId");
    }
    int indeximagePresent = cursor.getColumnIndex("imagePresent");
    if (indeximagePresent != -1 && !cursor.isNull(indeximagePresent)) {
      modelContainer.put("imagePresent", cursor.getInt(indeximagePresent));
    } else {
      modelContainer.putDefault("imagePresent");
    }
    int indexexternalId = cursor.getColumnIndex("externalId");
    if (indexexternalId != -1 && !cursor.isNull(indexexternalId)) {
      modelContainer.put("externalId", cursor.getString(indexexternalId));
    } else {
      modelContainer.putDefault("externalId");
    }
  }

  @Override
  public final ForeignKeyContainer<Client> toForeignKeyContainer(Client model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Client.class);
    modelContainer.put(Client_Table.id, model.id);
    return modelContainer;
  }
}
