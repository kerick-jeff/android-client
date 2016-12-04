package com.mifos.objects.client;

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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

public final class ClientPayload_Adapter extends ModelAdapter<ClientPayload> {
  public ClientPayload_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<ClientPayload> getModelClass() {
    return ClientPayload.class;
  }

  public final String getTableName() {
    return "`ClientPayload`";
  }

  public final void updateAutoIncrement(ClientPayload model, Number id) {
    model.id = id.intValue();
  }

  @Override
  public final Number getAutoIncrementingId(ClientPayload model) {
    return model.id;
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "id";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ClientPayload_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ClientPayload model) {
    if (model.errorMessage != null) {
      values.put(ClientPayload_Table.errorMessage.getCursorKey(), model.errorMessage);
    } else {
      values.putNull(ClientPayload_Table.errorMessage.getCursorKey());
    }
    if (model.firstname != null) {
      values.put(ClientPayload_Table.firstname.getCursorKey(), model.firstname);
    } else {
      values.putNull(ClientPayload_Table.firstname.getCursorKey());
    }
    if (model.lastname != null) {
      values.put(ClientPayload_Table.lastname.getCursorKey(), model.lastname);
    } else {
      values.putNull(ClientPayload_Table.lastname.getCursorKey());
    }
    if (model.middlename != null) {
      values.put(ClientPayload_Table.middlename.getCursorKey(), model.middlename);
    } else {
      values.putNull(ClientPayload_Table.middlename.getCursorKey());
    }
    values.put(ClientPayload_Table.officeId.getCursorKey(), model.officeId);
    values.put(ClientPayload_Table.staffId.getCursorKey(), model.staffId);
    values.put(ClientPayload_Table.genderId.getCursorKey(), model.genderId);
    values.put(ClientPayload_Table.active.getCursorKey(), model.active ? 1 : 0);
    if (model.activationDate != null) {
      values.put(ClientPayload_Table.activationDate.getCursorKey(), model.activationDate);
    } else {
      values.putNull(ClientPayload_Table.activationDate.getCursorKey());
    }
    if (model.submittedOnDate != null) {
      values.put(ClientPayload_Table.submittedOnDate.getCursorKey(), model.submittedOnDate);
    } else {
      values.putNull(ClientPayload_Table.submittedOnDate.getCursorKey());
    }
    if (model.dateOfBirth != null) {
      values.put(ClientPayload_Table.dateOfBirth.getCursorKey(), model.dateOfBirth);
    } else {
      values.putNull(ClientPayload_Table.dateOfBirth.getCursorKey());
    }
    if (model.mobileNo != null) {
      values.put(ClientPayload_Table.mobileNo.getCursorKey(), model.mobileNo);
    } else {
      values.putNull(ClientPayload_Table.mobileNo.getCursorKey());
    }
    if (model.externalId != null) {
      values.put(ClientPayload_Table.externalId.getCursorKey(), model.externalId);
    } else {
      values.putNull(ClientPayload_Table.externalId.getCursorKey());
    }
    values.put(ClientPayload_Table.clientTypeId.getCursorKey(), model.clientTypeId);
    values.put(ClientPayload_Table.clientClassificationId.getCursorKey(), model.clientClassificationId);
    if (model.dateFormat != null) {
      values.put(ClientPayload_Table.dateFormat.getCursorKey(), model.dateFormat);
    } else {
      values.putNull(ClientPayload_Table.dateFormat.getCursorKey());
    }
    if (model.locale != null) {
      values.put(ClientPayload_Table.locale.getCursorKey(), model.locale);
    } else {
      values.putNull(ClientPayload_Table.locale.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ClientPayload model) {
    values.put(ClientPayload_Table.id.getCursorKey(), model.id);
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ClientPayload model, int start) {
    if (model.errorMessage != null) {
      statement.bindString(1 + start, model.errorMessage);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.firstname != null) {
      statement.bindString(2 + start, model.firstname);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.lastname != null) {
      statement.bindString(3 + start, model.lastname);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.middlename != null) {
      statement.bindString(4 + start, model.middlename);
    } else {
      statement.bindNull(4 + start);
    }
    statement.bindLong(5 + start, model.officeId);
    statement.bindLong(6 + start, model.staffId);
    statement.bindLong(7 + start, model.genderId);
    statement.bindLong(8 + start, model.active ? 1 : 0);
    if (model.activationDate != null) {
      statement.bindString(9 + start, model.activationDate);
    } else {
      statement.bindNull(9 + start);
    }
    if (model.submittedOnDate != null) {
      statement.bindString(10 + start, model.submittedOnDate);
    } else {
      statement.bindNull(10 + start);
    }
    if (model.dateOfBirth != null) {
      statement.bindString(11 + start, model.dateOfBirth);
    } else {
      statement.bindNull(11 + start);
    }
    if (model.mobileNo != null) {
      statement.bindString(12 + start, model.mobileNo);
    } else {
      statement.bindNull(12 + start);
    }
    if (model.externalId != null) {
      statement.bindString(13 + start, model.externalId);
    } else {
      statement.bindNull(13 + start);
    }
    statement.bindLong(14 + start, model.clientTypeId);
    statement.bindLong(15 + start, model.clientClassificationId);
    if (model.dateFormat != null) {
      statement.bindString(16 + start, model.dateFormat);
    } else {
      statement.bindNull(16 + start);
    }
    if (model.locale != null) {
      statement.bindString(17 + start, model.locale);
    } else {
      statement.bindNull(17 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ClientPayload model) {
    statement.bindLong(1, model.id);
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ClientPayload`(`errorMessage`,`firstname`,`lastname`,`middlename`,`officeId`,`staffId`,`genderId`,`active`,`activationDate`,`submittedOnDate`,`dateOfBirth`,`mobileNo`,`externalId`,`clientTypeId`,`clientClassificationId`,`dateFormat`,`locale`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ClientPayload`(`id`,`errorMessage`,`firstname`,`lastname`,`middlename`,`officeId`,`staffId`,`genderId`,`active`,`activationDate`,`submittedOnDate`,`dateOfBirth`,`mobileNo`,`externalId`,`clientTypeId`,`clientClassificationId`,`dateFormat`,`locale`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ClientPayload`(`id` INTEGER PRIMARY KEY AUTOINCREMENT,`errorMessage` TEXT,`firstname` TEXT,`lastname` TEXT,`middlename` TEXT,`officeId` INTEGER,`staffId` INTEGER,`genderId` INTEGER,`active` INTEGER,`activationDate` TEXT,`submittedOnDate` TEXT,`dateOfBirth` TEXT,`mobileNo` TEXT,`externalId` TEXT,`clientTypeId` INTEGER,`clientClassificationId` INTEGER,`dateFormat` TEXT,`locale` TEXT" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ClientPayload model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = 0;
    }
    int indexerrorMessage = cursor.getColumnIndex("errorMessage");
    if (indexerrorMessage != -1 && !cursor.isNull(indexerrorMessage)) {
      model.errorMessage = cursor.getString(indexerrorMessage);
    } else {
      model.errorMessage = null;
    }
    int indexfirstname = cursor.getColumnIndex("firstname");
    if (indexfirstname != -1 && !cursor.isNull(indexfirstname)) {
      model.firstname = cursor.getString(indexfirstname);
    } else {
      model.firstname = null;
    }
    int indexlastname = cursor.getColumnIndex("lastname");
    if (indexlastname != -1 && !cursor.isNull(indexlastname)) {
      model.lastname = cursor.getString(indexlastname);
    } else {
      model.lastname = null;
    }
    int indexmiddlename = cursor.getColumnIndex("middlename");
    if (indexmiddlename != -1 && !cursor.isNull(indexmiddlename)) {
      model.middlename = cursor.getString(indexmiddlename);
    } else {
      model.middlename = null;
    }
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      model.officeId = cursor.getInt(indexofficeId);
    } else {
      model.officeId = 0;
    }
    int indexstaffId = cursor.getColumnIndex("staffId");
    if (indexstaffId != -1 && !cursor.isNull(indexstaffId)) {
      model.staffId = cursor.getInt(indexstaffId);
    } else {
      model.staffId = 0;
    }
    int indexgenderId = cursor.getColumnIndex("genderId");
    if (indexgenderId != -1 && !cursor.isNull(indexgenderId)) {
      model.genderId = cursor.getInt(indexgenderId);
    } else {
      model.genderId = 0;
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      model.active = cursor.getInt(indexactive) == 1 ? true : false;
    } else {
      model.active = false;
    }
    int indexactivationDate = cursor.getColumnIndex("activationDate");
    if (indexactivationDate != -1 && !cursor.isNull(indexactivationDate)) {
      model.activationDate = cursor.getString(indexactivationDate);
    } else {
      model.activationDate = null;
    }
    int indexsubmittedOnDate = cursor.getColumnIndex("submittedOnDate");
    if (indexsubmittedOnDate != -1 && !cursor.isNull(indexsubmittedOnDate)) {
      model.submittedOnDate = cursor.getString(indexsubmittedOnDate);
    } else {
      model.submittedOnDate = null;
    }
    int indexdateOfBirth = cursor.getColumnIndex("dateOfBirth");
    if (indexdateOfBirth != -1 && !cursor.isNull(indexdateOfBirth)) {
      model.dateOfBirth = cursor.getString(indexdateOfBirth);
    } else {
      model.dateOfBirth = null;
    }
    int indexmobileNo = cursor.getColumnIndex("mobileNo");
    if (indexmobileNo != -1 && !cursor.isNull(indexmobileNo)) {
      model.mobileNo = cursor.getString(indexmobileNo);
    } else {
      model.mobileNo = null;
    }
    int indexexternalId = cursor.getColumnIndex("externalId");
    if (indexexternalId != -1 && !cursor.isNull(indexexternalId)) {
      model.externalId = cursor.getString(indexexternalId);
    } else {
      model.externalId = null;
    }
    int indexclientTypeId = cursor.getColumnIndex("clientTypeId");
    if (indexclientTypeId != -1 && !cursor.isNull(indexclientTypeId)) {
      model.clientTypeId = cursor.getInt(indexclientTypeId);
    } else {
      model.clientTypeId = 0;
    }
    int indexclientClassificationId = cursor.getColumnIndex("clientClassificationId");
    if (indexclientClassificationId != -1 && !cursor.isNull(indexclientClassificationId)) {
      model.clientClassificationId = cursor.getInt(indexclientClassificationId);
    } else {
      model.clientClassificationId = 0;
    }
    int indexdateFormat = cursor.getColumnIndex("dateFormat");
    if (indexdateFormat != -1 && !cursor.isNull(indexdateFormat)) {
      model.dateFormat = cursor.getString(indexdateFormat);
    } else {
      model.dateFormat = null;
    }
    int indexlocale = cursor.getColumnIndex("locale");
    if (indexlocale != -1 && !cursor.isNull(indexlocale)) {
      model.locale = cursor.getString(indexlocale);
    } else {
      model.locale = null;
    }
  }

  @Override
  public final boolean exists(ClientPayload model, DatabaseWrapper wrapper) {
    return model.id > 0 && new Select(Method.count()).from(ClientPayload.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ClientPayload model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(ClientPayload_Table.id.eq(model.id));return clause;
  }

  @Override
  public final ClientPayload newInstance() {
    return new ClientPayload();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return ClientPayload_Table.getProperty(name);
  }
}
