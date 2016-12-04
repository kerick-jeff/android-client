package com.mifos.objects.organisation;

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

public final class Office_Adapter extends ModelAdapter<Office> {
  public Office_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Office> getModelClass() {
    return Office.class;
  }

  public final String getTableName() {
    return "`Office`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Office_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Office model) {
    if (model.id != null) {
      values.put(Office_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(Office_Table.id.getCursorKey());
    }
    if (model.externalId != null) {
      values.put(Office_Table.externalId.getCursorKey(), model.externalId);
    } else {
      values.putNull(Office_Table.externalId.getCursorKey());
    }
    if (model.name != null) {
      values.put(Office_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(Office_Table.name.getCursorKey());
    }
    if (model.nameDecorated != null) {
      values.put(Office_Table.nameDecorated.getCursorKey(), model.nameDecorated);
    } else {
      values.putNull(Office_Table.nameDecorated.getCursorKey());
    }
    if (model.officeOpeningDate != null) {
      model.officeOpeningDate.save();
      values.put(Office_Table.officeOpeningDate_officeId.getCursorKey(), model.officeOpeningDate.officeId);
    } else {
      values.putNull("`officeOpeningDate_officeId`");
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Office model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Office model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.externalId != null) {
      statement.bindString(2 + start, model.externalId);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.name != null) {
      statement.bindString(3 + start, model.name);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.nameDecorated != null) {
      statement.bindString(4 + start, model.nameDecorated);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.officeOpeningDate != null) {
      model.officeOpeningDate.save();
      statement.bindLong(5 + start, model.officeOpeningDate.officeId);
    } else {
      statement.bindNull(5 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Office model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Office`(`id`,`externalId`,`name`,`nameDecorated`,`officeOpeningDate_officeId`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Office`(`id`,`externalId`,`name`,`nameDecorated`,`officeOpeningDate_officeId`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Office`(`id` INTEGER,`externalId` TEXT,`name` TEXT,`nameDecorated` TEXT,`officeOpeningDate_officeId` INTEGER, PRIMARY KEY(`id`)"+ ", FOREIGN KEY(`officeOpeningDate_officeId`) REFERENCES " + FlowManager.getTableName(OfficeOpeningDate.class) + "(`officeId`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Office model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
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
    int indexnameDecorated = cursor.getColumnIndex("nameDecorated");
    if (indexnameDecorated != -1 && !cursor.isNull(indexnameDecorated)) {
      model.nameDecorated = cursor.getString(indexnameDecorated);
    } else {
      model.nameDecorated = null;
    }
    //// Only load model if references match, for efficiency
    int indexofficeOpeningDate_officeId = cursor.getColumnIndex("officeOpeningDate_officeId");
    if (indexofficeOpeningDate_officeId != -1 && !cursor.isNull(indexofficeOpeningDate_officeId)) {
      model.officeOpeningDate = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.organisation.OfficeOpeningDate.class).where()
          .and(com.mifos.objects.organisation.OfficeOpeningDate_Table.officeId.eq(cursor.getInt(indexofficeOpeningDate_officeId))).querySingle();
    }
  }

  @Override
  public final boolean exists(Office model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Office.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Office model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Office_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Office newInstance() {
    return new Office();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Office_Table.getProperty(name);
  }
}
