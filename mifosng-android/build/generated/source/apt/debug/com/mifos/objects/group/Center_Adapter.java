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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

public final class Center_Adapter extends ModelAdapter<Center> {
  public Center_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Center> getModelClass() {
    return Center.class;
  }

  public final String getTableName() {
    return "`Center`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Center_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Center model) {
    if (model.id != null) {
      values.put(Center_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(Center_Table.id.getCursorKey());
    }
    Integer refsync = model.sync != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.sync) : null;
    if (refsync != null) {
      values.put(Center_Table.sync.getCursorKey(), refsync);
    } else {
      values.putNull(Center_Table.sync.getCursorKey());
    }
    if (model.accountNo != null) {
      values.put(Center_Table.accountNo.getCursorKey(), model.accountNo);
    } else {
      values.putNull(Center_Table.accountNo.getCursorKey());
    }
    if (model.name != null) {
      values.put(Center_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(Center_Table.name.getCursorKey());
    }
    if (model.officeId != null) {
      values.put(Center_Table.officeId.getCursorKey(), model.officeId);
    } else {
      values.putNull(Center_Table.officeId.getCursorKey());
    }
    if (model.officeName != null) {
      values.put(Center_Table.officeName.getCursorKey(), model.officeName);
    } else {
      values.putNull(Center_Table.officeName.getCursorKey());
    }
    if (model.staffId != null) {
      values.put(Center_Table.staffId.getCursorKey(), model.staffId);
    } else {
      values.putNull(Center_Table.staffId.getCursorKey());
    }
    if (model.staffName != null) {
      values.put(Center_Table.staffName.getCursorKey(), model.staffName);
    } else {
      values.putNull(Center_Table.staffName.getCursorKey());
    }
    if (model.hierarchy != null) {
      values.put(Center_Table.hierarchy.getCursorKey(), model.hierarchy);
    } else {
      values.putNull(Center_Table.hierarchy.getCursorKey());
    }
    Integer refactive = model.active != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.active) : null;
    if (refactive != null) {
      values.put(Center_Table.active.getCursorKey(), refactive);
    } else {
      values.putNull(Center_Table.active.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Center model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Center model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    Integer refsync = model.sync != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.sync) : null;
    if (refsync != null) {
      statement.bindLong(2 + start, refsync);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.accountNo != null) {
      statement.bindString(3 + start, model.accountNo);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.name != null) {
      statement.bindString(4 + start, model.name);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.officeId != null) {
      statement.bindLong(5 + start, model.officeId);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.officeName != null) {
      statement.bindString(6 + start, model.officeName);
    } else {
      statement.bindNull(6 + start);
    }
    if (model.staffId != null) {
      statement.bindLong(7 + start, model.staffId);
    } else {
      statement.bindNull(7 + start);
    }
    if (model.staffName != null) {
      statement.bindString(8 + start, model.staffName);
    } else {
      statement.bindNull(8 + start);
    }
    if (model.hierarchy != null) {
      statement.bindString(9 + start, model.hierarchy);
    } else {
      statement.bindNull(9 + start);
    }
    Integer refactive = model.active != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.active) : null;
    if (refactive != null) {
      statement.bindLong(10 + start, refactive);
    } else {
      statement.bindNull(10 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Center model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Center`(`id`,`sync`,`accountNo`,`name`,`officeId`,`officeName`,`staffId`,`staffName`,`hierarchy`,`active`) VALUES (?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Center`(`id`,`sync`,`accountNo`,`name`,`officeId`,`officeName`,`staffId`,`staffName`,`hierarchy`,`active`) VALUES (?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Center`(`id` INTEGER,`sync` INTEGER,`accountNo` TEXT,`name` TEXT,`officeId` INTEGER,`officeName` TEXT,`staffId` INTEGER,`staffName` TEXT,`hierarchy` TEXT,`active` INTEGER, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Center model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
    }
    int indexsync = cursor.getColumnIndex("sync");
    if (indexsync != -1 && !cursor.isNull(indexsync)) {
      model.sync = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexsync));
    } else {
      model.sync = null;
    }
    int indexaccountNo = cursor.getColumnIndex("accountNo");
    if (indexaccountNo != -1 && !cursor.isNull(indexaccountNo)) {
      model.accountNo = cursor.getString(indexaccountNo);
    } else {
      model.accountNo = null;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
    int indexofficeId = cursor.getColumnIndex("officeId");
    if (indexofficeId != -1 && !cursor.isNull(indexofficeId)) {
      model.officeId = cursor.getInt(indexofficeId);
    } else {
      model.officeId = null;
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
      model.staffId = null;
    }
    int indexstaffName = cursor.getColumnIndex("staffName");
    if (indexstaffName != -1 && !cursor.isNull(indexstaffName)) {
      model.staffName = cursor.getString(indexstaffName);
    } else {
      model.staffName = null;
    }
    int indexhierarchy = cursor.getColumnIndex("hierarchy");
    if (indexhierarchy != -1 && !cursor.isNull(indexhierarchy)) {
      model.hierarchy = cursor.getString(indexhierarchy);
    } else {
      model.hierarchy = null;
    }
    int indexactive = cursor.getColumnIndex("active");
    if (indexactive != -1 && !cursor.isNull(indexactive)) {
      model.active = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexactive));
    } else {
      model.active = null;
    }
  }

  @Override
  public final boolean exists(Center model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Center.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Center model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Center_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Center newInstance() {
    return new Center();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Center_Table.getProperty(name);
  }
}
