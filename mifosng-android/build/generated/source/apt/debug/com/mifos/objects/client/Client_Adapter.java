package com.mifos.objects.client;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.config.FlowManager;
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

public final class Client_Adapter extends ModelAdapter<Client> {
  public Client_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Client> getModelClass() {
    return Client.class;
  }

  public final String getTableName() {
    return "`Client`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Client_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Client model) {
    values.put(Client_Table.id.getCursorKey(), model.id);
    values.put(Client_Table.groupId.getCursorKey(), model.groupId);
    if (model.accountNo != null) {
      values.put(Client_Table.accountNo.getCursorKey(), model.accountNo);
    } else {
      values.putNull(Client_Table.accountNo.getCursorKey());
    }
    if (model.status != null) {
      model.status.save();
      values.put(Client_Table.status_id.getCursorKey(), model.status.id);
    } else {
      values.putNull("`status_id`");
    }
    values.put(Client_Table.sync.getCursorKey(), model.sync ? 1 : 0);
    values.put(Client_Table.active.getCursorKey(), model.active ? 1 : 0);
    if (model.clientDate != null) {
      model.clientDate.save();
      values.put(Client_Table.clientDate_clientId.getCursorKey(), model.clientDate.clientId);
      values.put(Client_Table.clientDate_chargeId.getCursorKey(), model.clientDate.chargeId);
    } else {
      values.putNull("`clientDate_clientId`");
      values.putNull("`clientDate_chargeId`");
    }
    if (model.firstname != null) {
      values.put(Client_Table.firstname.getCursorKey(), model.firstname);
    } else {
      values.putNull(Client_Table.firstname.getCursorKey());
    }
    if (model.middlename != null) {
      values.put(Client_Table.middlename.getCursorKey(), model.middlename);
    } else {
      values.putNull(Client_Table.middlename.getCursorKey());
    }
    if (model.lastname != null) {
      values.put(Client_Table.lastname.getCursorKey(), model.lastname);
    } else {
      values.putNull(Client_Table.lastname.getCursorKey());
    }
    if (model.displayName != null) {
      values.put(Client_Table.displayName.getCursorKey(), model.displayName);
    } else {
      values.putNull(Client_Table.displayName.getCursorKey());
    }
    values.put(Client_Table.officeId.getCursorKey(), model.officeId);
    if (model.officeName != null) {
      values.put(Client_Table.officeName.getCursorKey(), model.officeName);
    } else {
      values.putNull(Client_Table.officeName.getCursorKey());
    }
    values.put(Client_Table.staffId.getCursorKey(), model.staffId);
    if (model.staffName != null) {
      values.put(Client_Table.staffName.getCursorKey(), model.staffName);
    } else {
      values.putNull(Client_Table.staffName.getCursorKey());
    }
    if (model.fullname != null) {
      values.put(Client_Table.fullname.getCursorKey(), model.fullname);
    } else {
      values.putNull(Client_Table.fullname.getCursorKey());
    }
    values.put(Client_Table.imageId.getCursorKey(), model.imageId);
    values.put(Client_Table.imagePresent.getCursorKey(), model.imagePresent ? 1 : 0);
    if (model.getExternalId() != null) {
      values.put(Client_Table.externalId.getCursorKey(), model.getExternalId());
    } else {
      values.putNull(Client_Table.externalId.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Client model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Client model, int start) {
    statement.bindLong(1 + start, model.id);
    statement.bindLong(2 + start, model.groupId);
    if (model.accountNo != null) {
      statement.bindString(3 + start, model.accountNo);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.status != null) {
      model.status.save();
      statement.bindLong(4 + start, model.status.id);
    } else {
      statement.bindNull(4 + start);
    }
    statement.bindLong(5 + start, model.sync ? 1 : 0);
    statement.bindLong(6 + start, model.active ? 1 : 0);
    if (model.clientDate != null) {
      model.clientDate.save();
      statement.bindLong(7 + start, model.clientDate.clientId);
      statement.bindLong(8 + start, model.clientDate.chargeId);
    } else {
      statement.bindNull(7 + start);
      statement.bindNull(8 + start);
    }
    if (model.firstname != null) {
      statement.bindString(9 + start, model.firstname);
    } else {
      statement.bindNull(9 + start);
    }
    if (model.middlename != null) {
      statement.bindString(10 + start, model.middlename);
    } else {
      statement.bindNull(10 + start);
    }
    if (model.lastname != null) {
      statement.bindString(11 + start, model.lastname);
    } else {
      statement.bindNull(11 + start);
    }
    if (model.displayName != null) {
      statement.bindString(12 + start, model.displayName);
    } else {
      statement.bindNull(12 + start);
    }
    statement.bindLong(13 + start, model.officeId);
    if (model.officeName != null) {
      statement.bindString(14 + start, model.officeName);
    } else {
      statement.bindNull(14 + start);
    }
    statement.bindLong(15 + start, model.staffId);
    if (model.staffName != null) {
      statement.bindString(16 + start, model.staffName);
    } else {
      statement.bindNull(16 + start);
    }
    if (model.fullname != null) {
      statement.bindString(17 + start, model.fullname);
    } else {
      statement.bindNull(17 + start);
    }
    statement.bindLong(18 + start, model.imageId);
    statement.bindLong(19 + start, model.imagePresent ? 1 : 0);
    if (model.getExternalId() != null) {
      statement.bindString(20 + start, model.getExternalId());
    } else {
      statement.bindNull(20 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Client model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Client`(`id`,`groupId`,`accountNo`,`status_id`,`sync`,`active`,`clientDate_clientId`,`clientDate_chargeId`,`firstname`,`middlename`,`lastname`,`displayName`,`officeId`,`officeName`,`staffId`,`staffName`,`fullname`,`imageId`,`imagePresent`,`externalId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Client`(`id`,`groupId`,`accountNo`,`status_id`,`sync`,`active`,`clientDate_clientId`,`clientDate_chargeId`,`firstname`,`middlename`,`lastname`,`displayName`,`officeId`,`officeName`,`staffId`,`staffName`,`fullname`,`imageId`,`imagePresent`,`externalId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Client`(`id` INTEGER,`groupId` INTEGER,`accountNo` TEXT,`status_id` INTEGER,`sync` INTEGER,`active` INTEGER,`clientDate_clientId` INTEGER ,`clientDate_chargeId` INTEGER,`firstname` TEXT,`middlename` TEXT,`lastname` TEXT,`displayName` TEXT,`officeId` INTEGER,`officeName` TEXT,`staffId` INTEGER,`staffName` TEXT,`fullname` TEXT,`imageId` INTEGER,`imagePresent` INTEGER,`externalId` TEXT, PRIMARY KEY(`id`)"+ ", FOREIGN KEY(`status_id`) REFERENCES " + FlowManager.getTableName(Status.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`clientDate_clientId`,`clientDate_chargeId`) REFERENCES " + FlowManager.getTableName(ClientDate.class) + "(`clientId`, `chargeId`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Client model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = 0;
    }
    int indexgroupId = cursor.getColumnIndex("groupId");
    if (indexgroupId != -1 && !cursor.isNull(indexgroupId)) {
      model.groupId = cursor.getInt(indexgroupId);
    } else {
      model.groupId = 0;
    }
    int indexaccountNo = cursor.getColumnIndex("accountNo");
    if (indexaccountNo != -1 && !cursor.isNull(indexaccountNo)) {
      model.accountNo = cursor.getString(indexaccountNo);
    } else {
      model.accountNo = null;
    }
    //// Only load model if references match, for efficiency
    int indexstatus_id = cursor.getColumnIndex("status_id");
    if (indexstatus_id != -1 && !cursor.isNull(indexstatus_id)) {
      model.status = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.Status.class).where()
          .and(com.mifos.objects.client.Status_Table.id.eq(cursor.getInt(indexstatus_id))).querySingle();
    }
    int indexsync = cursor.getColumnIndex("sync");
    if (indexsync != -1 && !cursor.isNull(indexsync)) {
      model.sync = cursor.getInt(indexsync) == 1 ? true : false;
    } else {
      model.sync = false;
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      model.active = cursor.getInt(indexactive) == 1 ? true : false;
    } else {
      model.active = false;
    }
    //// Only load model if references match, for efficiency
    int indexclientDate_clientId = cursor.getColumnIndex("clientDate_clientId");
    int indexclientDate_chargeId = cursor.getColumnIndex("clientDate_chargeId");
    if (indexclientDate_clientId != -1 && !cursor.isNull(indexclientDate_clientId) && indexclientDate_chargeId != -1 && !cursor.isNull(indexclientDate_chargeId)) {
      model.clientDate = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.ClientDate.class).where()
          .and(com.mifos.objects.client.ClientDate_Table.clientId.eq(cursor.getLong(indexclientDate_clientId)))
          .and(com.mifos.objects.client.ClientDate_Table.chargeId.eq(cursor.getLong(indexclientDate_chargeId))).querySingle();
    }
    int indexfirstname = cursor.getColumnIndex("firstname");
    if (indexfirstname != -1 && !cursor.isNull(indexfirstname)) {
      model.firstname = cursor.getString(indexfirstname);
    } else {
      model.firstname = null;
    }
    int indexmiddlename = cursor.getColumnIndex("middlename");
    if (indexmiddlename != -1 && !cursor.isNull(indexmiddlename)) {
      model.middlename = cursor.getString(indexmiddlename);
    } else {
      model.middlename = null;
    }
    int indexlastname = cursor.getColumnIndex("lastname");
    if (indexlastname != -1 && !cursor.isNull(indexlastname)) {
      model.lastname = cursor.getString(indexlastname);
    } else {
      model.lastname = null;
    }
    int indexdisplayName = cursor.getColumnIndex("displayName");
    if (indexdisplayName != -1 && !cursor.isNull(indexdisplayName)) {
      model.displayName = cursor.getString(indexdisplayName);
    } else {
      model.displayName = null;
    }
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      model.officeId = cursor.getInt(indexofficeId);
    } else {
      model.officeId = 0;
    }
    int indexofficeName = cursor.getColumnIndex("officeName");
    if (indexofficeName != -1 && !cursor.isNull(indexofficeName)) {
      model.officeName = cursor.getString(indexofficeName);
    } else {
      model.officeName = null;
    }
    int indexstaffId = cursor.getColumnIndex("staffId");
    if (indexstaffId != -1 && !cursor.isNull(indexstaffId)) {
      model.staffId = cursor.getInt(indexstaffId);
    } else {
      model.staffId = 0;
    }
    int indexstaffName = cursor.getColumnIndex("staffName");
    if (indexstaffName != -1 && !cursor.isNull(indexstaffName)) {
      model.staffName = cursor.getString(indexstaffName);
    } else {
      model.staffName = null;
    }
    int indexfullname = cursor.getColumnIndex("fullname");
    if (indexfullname != -1 && !cursor.isNull(indexfullname)) {
      model.fullname = cursor.getString(indexfullname);
    } else {
      model.fullname = null;
    }
    int indeximageId = cursor.getColumnIndex("imageId");
    if (indeximageId != -1 && !cursor.isNull(indeximageId)) {
      model.imageId = cursor.getInt(indeximageId);
    } else {
      model.imageId = 0;
    }
    int indeximagePresent = cursor.getColumnIndex("imagePresent");
    if (indeximagePresent != -1 && !cursor.isNull(indeximagePresent)) {
      model.imagePresent = cursor.getInt(indeximagePresent) == 1 ? true : false;
    } else {
      model.imagePresent = false;
    }
    int indexexternalId = cursor.getColumnIndex("externalId");
    if (indexexternalId != -1 && !cursor.isNull(indexexternalId)) {
      model.setExternalId(cursor.getString(indexexternalId));
    } else {
      model.setExternalId(null);
    }
  }

  @Override
  public final boolean exists(Client model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Client.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Client model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Client_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Client newInstance() {
    return new Client();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Client_Table.getProperty(name);
  }
}
