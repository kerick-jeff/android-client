package com.mifos.objects;

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

public final class PaymentTypeOption_Adapter extends ModelAdapter<PaymentTypeOption> {
  public PaymentTypeOption_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<PaymentTypeOption> getModelClass() {
    return PaymentTypeOption.class;
  }

  public final String getTableName() {
    return "`PaymentTypeOption`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return PaymentTypeOption_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, PaymentTypeOption model) {
    if (model.id != null) {
      values.put(PaymentTypeOption_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(PaymentTypeOption_Table.id.getCursorKey());
    }
    if (model.name != null) {
      values.put(PaymentTypeOption_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(PaymentTypeOption_Table.name.getCursorKey());
    }
    if (model.description != null) {
      values.put(PaymentTypeOption_Table.description.getCursorKey(), model.description);
    } else {
      values.putNull(PaymentTypeOption_Table.description.getCursorKey());
    }
    Integer refisCashPayment = model.isCashPayment != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isCashPayment) : null;
    if (refisCashPayment != null) {
      values.put(PaymentTypeOption_Table.isCashPayment.getCursorKey(), refisCashPayment);
    } else {
      values.putNull(PaymentTypeOption_Table.isCashPayment.getCursorKey());
    }
    if (model.position != null) {
      values.put(PaymentTypeOption_Table.position.getCursorKey(), model.position);
    } else {
      values.putNull(PaymentTypeOption_Table.position.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, PaymentTypeOption model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, PaymentTypeOption model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.name != null) {
      statement.bindString(2 + start, model.name);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.description != null) {
      statement.bindString(3 + start, model.description);
    } else {
      statement.bindNull(3 + start);
    }
    Integer refisCashPayment = model.isCashPayment != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isCashPayment) : null;
    if (refisCashPayment != null) {
      statement.bindLong(4 + start, refisCashPayment);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.position != null) {
      statement.bindLong(5 + start, model.position);
    } else {
      statement.bindNull(5 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, PaymentTypeOption model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `PaymentTypeOption`(`id`,`name`,`description`,`isCashPayment`,`position`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `PaymentTypeOption`(`id`,`name`,`description`,`isCashPayment`,`position`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `PaymentTypeOption`(`id` INTEGER,`name` TEXT,`description` TEXT,`isCashPayment` INTEGER,`position` INTEGER, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, PaymentTypeOption model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
    int indexdescription = cursor.getColumnIndex("description");
    if (indexdescription != -1 && !cursor.isNull(indexdescription)) {
      model.description = cursor.getString(indexdescription);
    } else {
      model.description = null;
    }
    int indexisCashPayment = cursor.getColumnIndex("isCashPayment");
    if (indexisCashPayment != -1 && !cursor.isNull(indexisCashPayment)) {
      model.isCashPayment = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisCashPayment));
    } else {
      model.isCashPayment = null;
    }
    int indexposition = cursor.getColumnIndex("position");
    if (indexposition != -1 && !cursor.isNull(indexposition)) {
      model.position = cursor.getInt(indexposition);
    } else {
      model.position = null;
    }
  }

  @Override
  public final boolean exists(PaymentTypeOption model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(PaymentTypeOption.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(PaymentTypeOption model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(PaymentTypeOption_Table.id.eq(model.id));return clause;
  }

  @Override
  public final PaymentTypeOption newInstance() {
    return new PaymentTypeOption();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return PaymentTypeOption_Table.getProperty(name);
  }
}
