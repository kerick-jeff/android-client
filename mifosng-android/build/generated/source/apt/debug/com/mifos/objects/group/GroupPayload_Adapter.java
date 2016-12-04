package com.mifos.objects.group;

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

public final class GroupPayload_Adapter extends ModelAdapter<GroupPayload> {
  public GroupPayload_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<GroupPayload> getModelClass() {
    return GroupPayload.class;
  }

  public final String getTableName() {
    return "`GroupPayload`";
  }

  public final void updateAutoIncrement(GroupPayload model, Number id) {
    model.id = id.intValue();
  }

  @Override
  public final Number getAutoIncrementingId(GroupPayload model) {
    return model.id;
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "id";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return GroupPayload_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, GroupPayload model) {
    if (model.errorMessage != null) {
      values.put(GroupPayload_Table.errorMessage.getCursorKey(), model.errorMessage);
    } else {
      values.putNull(GroupPayload_Table.errorMessage.getCursorKey());
    }
    values.put(GroupPayload_Table.officeId.getCursorKey(), model.officeId);
    values.put(GroupPayload_Table.active.getCursorKey(), model.active ? 1 : 0);
    if (model.activationDate != null) {
      values.put(GroupPayload_Table.activationDate.getCursorKey(), model.activationDate);
    } else {
      values.putNull(GroupPayload_Table.activationDate.getCursorKey());
    }
    if (model.submittedOnDate != null) {
      values.put(GroupPayload_Table.submittedOnDate.getCursorKey(), model.submittedOnDate);
    } else {
      values.putNull(GroupPayload_Table.submittedOnDate.getCursorKey());
    }
    if (model.externalId != null) {
      values.put(GroupPayload_Table.externalId.getCursorKey(), model.externalId);
    } else {
      values.putNull(GroupPayload_Table.externalId.getCursorKey());
    }
    if (model.name != null) {
      values.put(GroupPayload_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(GroupPayload_Table.name.getCursorKey());
    }
    if (model.locale != null) {
      values.put(GroupPayload_Table.locale.getCursorKey(), model.locale);
    } else {
      values.putNull(GroupPayload_Table.locale.getCursorKey());
    }
    if (model.dateFormat != null) {
      values.put(GroupPayload_Table.dateFormat.getCursorKey(), model.dateFormat);
    } else {
      values.putNull(GroupPayload_Table.dateFormat.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, GroupPayload model) {
    values.put(GroupPayload_Table.id.getCursorKey(), model.id);
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, GroupPayload model, int start) {
    if (model.errorMessage != null) {
      statement.bindString(1 + start, model.errorMessage);
    } else {
      statement.bindNull(1 + start);
    }
    statement.bindLong(2 + start, model.officeId);
    statement.bindLong(3 + start, model.active ? 1 : 0);
    if (model.activationDate != null) {
      statement.bindString(4 + start, model.activationDate);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.submittedOnDate != null) {
      statement.bindString(5 + start, model.submittedOnDate);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.externalId != null) {
      statement.bindString(6 + start, model.externalId);
    } else {
      statement.bindNull(6 + start);
    }
    if (model.name != null) {
      statement.bindString(7 + start, model.name);
    } else {
      statement.bindNull(7 + start);
    }
    if (model.locale != null) {
      statement.bindString(8 + start, model.locale);
    } else {
      statement.bindNull(8 + start);
    }
    if (model.dateFormat != null) {
      statement.bindString(9 + start, model.dateFormat);
    } else {
      statement.bindNull(9 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, GroupPayload model) {
    statement.bindLong(1, model.id);
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `GroupPayload`(`errorMessage`,`officeId`,`active`,`activationDate`,`submittedOnDate`,`externalId`,`name`,`locale`,`dateFormat`) VALUES (?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `GroupPayload`(`id`,`errorMessage`,`officeId`,`active`,`activationDate`,`submittedOnDate`,`externalId`,`name`,`locale`,`dateFormat`) VALUES (?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `GroupPayload`(`id` INTEGER PRIMARY KEY AUTOINCREMENT,`errorMessage` TEXT,`officeId` INTEGER,`active` INTEGER,`activationDate` TEXT,`submittedOnDate` TEXT,`externalId` TEXT,`name` TEXT,`locale` TEXT,`dateFormat` TEXT" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, GroupPayload model) {
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
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      model.officeId = cursor.getInt(indexofficeId);
    } else {
      model.officeId = 0;
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
    int indexexternalId = cursor.getColumnIndex("externalId");
    if (indexexternalId != -1 && !cursor.isNull(indexexternalId)) {
      model.externalId = cursor.getString(indexexternalId);
    } else {
      model.externalId = null;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
    int indexlocale = cursor.getColumnIndex("locale");
    if (indexlocale != -1 && !cursor.isNull(indexlocale)) {
      model.locale = cursor.getString(indexlocale);
    } else {
      model.locale = null;
    }
    int indexdateFormat = cursor.getColumnIndex("dateFormat");
    if (indexdateFormat != -1 && !cursor.isNull(indexdateFormat)) {
      model.dateFormat = cursor.getString(indexdateFormat);
    } else {
      model.dateFormat = null;
    }
  }

  @Override
  public final boolean exists(GroupPayload model, DatabaseWrapper wrapper) {
    return model.id > 0 && new Select(Method.count()).from(GroupPayload.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(GroupPayload model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(GroupPayload_Table.id.eq(model.id));return clause;
  }

  @Override
  public final GroupPayload newInstance() {
    return new GroupPayload();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return GroupPayload_Table.getProperty(name);
  }
}
