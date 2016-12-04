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

public final class StaffOptions_Adapter extends ModelAdapter<StaffOptions> {
  public StaffOptions_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<StaffOptions> getModelClass() {
    return StaffOptions.class;
  }

  public final String getTableName() {
    return "`ClientTemplateStaffOptions`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return StaffOptions_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, StaffOptions model) {
    values.put(StaffOptions_Table.id.getCursorKey(), model.id);
    if (model.firstname != null) {
      values.put(StaffOptions_Table.firstname.getCursorKey(), model.firstname);
    } else {
      values.putNull(StaffOptions_Table.firstname.getCursorKey());
    }
    if (model.lastname != null) {
      values.put(StaffOptions_Table.lastname.getCursorKey(), model.lastname);
    } else {
      values.putNull(StaffOptions_Table.lastname.getCursorKey());
    }
    if (model.displayName != null) {
      values.put(StaffOptions_Table.displayName.getCursorKey(), model.displayName);
    } else {
      values.putNull(StaffOptions_Table.displayName.getCursorKey());
    }
    values.put(StaffOptions_Table.officeId.getCursorKey(), model.officeId);
    if (model.officeName != null) {
      values.put(StaffOptions_Table.officeName.getCursorKey(), model.officeName);
    } else {
      values.putNull(StaffOptions_Table.officeName.getCursorKey());
    }
    values.put(StaffOptions_Table.isLoan_officer.getCursorKey(), model.isLoan_officer ? 1 : 0);
    values.put(StaffOptions_Table.is_Active.getCursorKey(), model.is_Active ? 1 : 0);
  }

  @Override
  public final void bindToContentValues(ContentValues values, StaffOptions model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, StaffOptions model, int start) {
    statement.bindLong(1 + start, model.id);
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
    if (model.displayName != null) {
      statement.bindString(4 + start, model.displayName);
    } else {
      statement.bindNull(4 + start);
    }
    statement.bindLong(5 + start, model.officeId);
    if (model.officeName != null) {
      statement.bindString(6 + start, model.officeName);
    } else {
      statement.bindNull(6 + start);
    }
    statement.bindLong(7 + start, model.isLoan_officer ? 1 : 0);
    statement.bindLong(8 + start, model.is_Active ? 1 : 0);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, StaffOptions model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ClientTemplateStaffOptions`(`id`,`firstname`,`lastname`,`displayName`,`officeId`,`officeName`,`isLoan_officer`,`is_Active`) VALUES (?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ClientTemplateStaffOptions`(`id`,`firstname`,`lastname`,`displayName`,`officeId`,`officeName`,`isLoan_officer`,`is_Active`) VALUES (?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ClientTemplateStaffOptions`(`id` INTEGER,`firstname` TEXT,`lastname` TEXT,`displayName` TEXT,`officeId` INTEGER,`officeName` TEXT,`isLoan_officer` INTEGER,`is_Active` INTEGER, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, StaffOptions model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = 0;
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
    int indexisLoan_officer = cursor.getColumnIndex("isLoan_officer");
    if (indexisLoan_officer != -1 && !cursor.isNull(indexisLoan_officer)) {
      model.isLoan_officer = cursor.getInt(indexisLoan_officer) == 1 ? true : false;
    } else {
      model.isLoan_officer = false;
    }
    int indexis_Active = cursor.getColumnIndex("is_Active");
    if (indexis_Active != -1 && !cursor.isNull(indexis_Active)) {
      model.is_Active = cursor.getInt(indexis_Active) == 1 ? true : false;
    } else {
      model.is_Active = false;
    }
  }

  @Override
  public final boolean exists(StaffOptions model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(StaffOptions.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(StaffOptions model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(StaffOptions_Table.id.eq(model.id));return clause;
  }

  @Override
  public final StaffOptions newInstance() {
    return new StaffOptions();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return StaffOptions_Table.getProperty(name);
  }
}
