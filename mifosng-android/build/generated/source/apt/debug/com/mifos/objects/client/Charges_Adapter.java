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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

public final class Charges_Adapter extends ModelAdapter<Charges> {
  public Charges_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Charges> getModelClass() {
    return Charges.class;
  }

  public final String getTableName() {
    return "`Charges`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Charges_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Charges model) {
    if (model.id != null) {
      values.put(Charges_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(Charges_Table.id.getCursorKey());
    }
    if (model.clientId != null) {
      values.put(Charges_Table.clientId.getCursorKey(), model.clientId);
    } else {
      values.putNull(Charges_Table.clientId.getCursorKey());
    }
    if (model.loanId != null) {
      values.put(Charges_Table.loanId.getCursorKey(), model.loanId);
    } else {
      values.putNull(Charges_Table.loanId.getCursorKey());
    }
    if (model.chargeId != null) {
      values.put(Charges_Table.chargeId.getCursorKey(), model.chargeId);
    } else {
      values.putNull(Charges_Table.chargeId.getCursorKey());
    }
    if (model.name != null) {
      values.put(Charges_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(Charges_Table.name.getCursorKey());
    }
    if (model.chargeTimeType != null) {
      model.chargeTimeType.save();
      if (model.chargeTimeType.id != null) {
        values.put(Charges_Table.chargeTimeType_id.getCursorKey(), model.chargeTimeType.id);
      } else {
        values.putNull(Charges_Table.chargeTimeType_id.getCursorKey());
      }
    } else {
      values.putNull("`chargeTimeType_id`");
    }
    if (model.chargeDueDate != null) {
      model.chargeDueDate.save();
      values.put(Charges_Table.chargeDueDate_clientId.getCursorKey(), model.chargeDueDate.clientId);
      values.put(Charges_Table.chargeDueDate_chargeId.getCursorKey(), model.chargeDueDate.chargeId);
    } else {
      values.putNull("`chargeDueDate_clientId`");
      values.putNull("`chargeDueDate_chargeId`");
    }
    if (model.chargeCalculationType != null) {
      model.chargeCalculationType.save();
      if (model.chargeCalculationType.id != null) {
        values.put(Charges_Table.chargeCalculationType_id.getCursorKey(), model.chargeCalculationType.id);
      } else {
        values.putNull(Charges_Table.chargeCalculationType_id.getCursorKey());
      }
    } else {
      values.putNull("`chargeCalculationType_id`");
    }
    if (model.currency != null) {
      model.currency.save();
      if (model.currency.code != null) {
        values.put(Charges_Table.currency_code.getCursorKey(), model.currency.code);
      } else {
        values.putNull(Charges_Table.currency_code.getCursorKey());
      }
    } else {
      values.putNull("`currency_code`");
    }
    if (model.amount != null) {
      values.put(Charges_Table.amount.getCursorKey(), model.amount);
    } else {
      values.putNull(Charges_Table.amount.getCursorKey());
    }
    if (model.amountPaid != null) {
      values.put(Charges_Table.amountPaid.getCursorKey(), model.amountPaid);
    } else {
      values.putNull(Charges_Table.amountPaid.getCursorKey());
    }
    if (model.amountWaived != null) {
      values.put(Charges_Table.amountWaived.getCursorKey(), model.amountWaived);
    } else {
      values.putNull(Charges_Table.amountWaived.getCursorKey());
    }
    if (model.amountWrittenOff != null) {
      values.put(Charges_Table.amountWrittenOff.getCursorKey(), model.amountWrittenOff);
    } else {
      values.putNull(Charges_Table.amountWrittenOff.getCursorKey());
    }
    if (model.amountOutstanding != null) {
      values.put(Charges_Table.amountOutstanding.getCursorKey(), model.amountOutstanding);
    } else {
      values.putNull(Charges_Table.amountOutstanding.getCursorKey());
    }
    Integer refpenalty = model.penalty != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.penalty) : null;
    if (refpenalty != null) {
      values.put(Charges_Table.penalty.getCursorKey(), refpenalty);
    } else {
      values.putNull(Charges_Table.penalty.getCursorKey());
    }
    Integer refisActive = model.isActive != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isActive) : null;
    if (refisActive != null) {
      values.put(Charges_Table.isActive.getCursorKey(), refisActive);
    } else {
      values.putNull(Charges_Table.isActive.getCursorKey());
    }
    Integer refisPaid = model.isPaid != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isPaid) : null;
    if (refisPaid != null) {
      values.put(Charges_Table.isPaid.getCursorKey(), refisPaid);
    } else {
      values.putNull(Charges_Table.isPaid.getCursorKey());
    }
    Integer refisWaived = model.isWaived != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isWaived) : null;
    if (refisWaived != null) {
      values.put(Charges_Table.isWaived.getCursorKey(), refisWaived);
    } else {
      values.putNull(Charges_Table.isWaived.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Charges model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Charges model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.clientId != null) {
      statement.bindLong(2 + start, model.clientId);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.loanId != null) {
      statement.bindLong(3 + start, model.loanId);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.chargeId != null) {
      statement.bindLong(4 + start, model.chargeId);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.name != null) {
      statement.bindString(5 + start, model.name);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.chargeTimeType != null) {
      model.chargeTimeType.save();
      if (model.chargeTimeType.id != null) {
        statement.bindLong(6 + start, model.chargeTimeType.id);
      } else {
        statement.bindNull(6 + start);
      }
    } else {
      statement.bindNull(6 + start);
    }
    if (model.chargeDueDate != null) {
      model.chargeDueDate.save();
      statement.bindLong(7 + start, model.chargeDueDate.clientId);
      statement.bindLong(8 + start, model.chargeDueDate.chargeId);
    } else {
      statement.bindNull(7 + start);
      statement.bindNull(8 + start);
    }
    if (model.chargeCalculationType != null) {
      model.chargeCalculationType.save();
      if (model.chargeCalculationType.id != null) {
        statement.bindLong(9 + start, model.chargeCalculationType.id);
      } else {
        statement.bindNull(9 + start);
      }
    } else {
      statement.bindNull(9 + start);
    }
    if (model.currency != null) {
      model.currency.save();
      if (model.currency.code != null) {
        statement.bindString(10 + start, model.currency.code);
      } else {
        statement.bindNull(10 + start);
      }
    } else {
      statement.bindNull(10 + start);
    }
    if (model.amount != null) {
      statement.bindDouble(11 + start, model.amount);
    } else {
      statement.bindNull(11 + start);
    }
    if (model.amountPaid != null) {
      statement.bindDouble(12 + start, model.amountPaid);
    } else {
      statement.bindNull(12 + start);
    }
    if (model.amountWaived != null) {
      statement.bindDouble(13 + start, model.amountWaived);
    } else {
      statement.bindNull(13 + start);
    }
    if (model.amountWrittenOff != null) {
      statement.bindDouble(14 + start, model.amountWrittenOff);
    } else {
      statement.bindNull(14 + start);
    }
    if (model.amountOutstanding != null) {
      statement.bindDouble(15 + start, model.amountOutstanding);
    } else {
      statement.bindNull(15 + start);
    }
    Integer refpenalty = model.penalty != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.penalty) : null;
    if (refpenalty != null) {
      statement.bindLong(16 + start, refpenalty);
    } else {
      statement.bindNull(16 + start);
    }
    Integer refisActive = model.isActive != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isActive) : null;
    if (refisActive != null) {
      statement.bindLong(17 + start, refisActive);
    } else {
      statement.bindNull(17 + start);
    }
    Integer refisPaid = model.isPaid != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isPaid) : null;
    if (refisPaid != null) {
      statement.bindLong(18 + start, refisPaid);
    } else {
      statement.bindNull(18 + start);
    }
    Integer refisWaived = model.isWaived != null ? (java.lang.Integer) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getDBValue((java.lang.Boolean) model.isWaived) : null;
    if (refisWaived != null) {
      statement.bindLong(19 + start, refisWaived);
    } else {
      statement.bindNull(19 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Charges model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Charges`(`id`,`clientId`,`loanId`,`chargeId`,`name`,`chargeTimeType_id`,`chargeDueDate_clientId`,`chargeDueDate_chargeId`,`chargeCalculationType_id`,`currency_code`,`amount`,`amountPaid`,`amountWaived`,`amountWrittenOff`,`amountOutstanding`,`penalty`,`isActive`,`isPaid`,`isWaived`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Charges`(`id`,`clientId`,`loanId`,`chargeId`,`name`,`chargeTimeType_id`,`chargeDueDate_clientId`,`chargeDueDate_chargeId`,`chargeCalculationType_id`,`currency_code`,`amount`,`amountPaid`,`amountWaived`,`amountWrittenOff`,`amountOutstanding`,`penalty`,`isActive`,`isPaid`,`isWaived`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Charges`(`id` INTEGER,`clientId` INTEGER,`loanId` INTEGER,`chargeId` INTEGER,`name` TEXT,`chargeTimeType_id` INTEGER,`chargeDueDate_clientId` INTEGER ,`chargeDueDate_chargeId` INTEGER,`chargeCalculationType_id` INTEGER,`currency_code` TEXT,`amount` REAL,`amountPaid` REAL,`amountWaived` REAL,`amountWrittenOff` REAL,`amountOutstanding` REAL,`penalty` INTEGER,`isActive` INTEGER,`isPaid` INTEGER,`isWaived` INTEGER, PRIMARY KEY(`id`)"+ ", FOREIGN KEY(`chargeTimeType_id`) REFERENCES " + FlowManager.getTableName(ChargeTimeType.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`chargeDueDate_clientId`,`chargeDueDate_chargeId`) REFERENCES " + FlowManager.getTableName(ClientDate.class) + "(`clientId`, `chargeId`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`chargeCalculationType_id`) REFERENCES " + FlowManager.getTableName(ChargeCalculationType.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`currency_code`) REFERENCES " + FlowManager.getTableName(Currency.class) + "(`code`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Charges model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
    }
    int indexclientId = cursor.getColumnIndex("clientId");
    if (indexclientId != -1 && !cursor.isNull(indexclientId)) {
      model.clientId = cursor.getInt(indexclientId);
    } else {
      model.clientId = null;
    }
    int indexloanId = cursor.getColumnIndex("loanId");
    if (indexloanId != -1 && !cursor.isNull(indexloanId)) {
      model.loanId = cursor.getInt(indexloanId);
    } else {
      model.loanId = null;
    }
    int indexchargeId = cursor.getColumnIndex("chargeId");
    if (indexchargeId != -1 && !cursor.isNull(indexchargeId)) {
      model.chargeId = cursor.getInt(indexchargeId);
    } else {
      model.chargeId = null;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
    //// Only load model if references match, for efficiency
    int indexchargeTimeType_id = cursor.getColumnIndex("chargeTimeType_id");
    if (indexchargeTimeType_id != -1 && !cursor.isNull(indexchargeTimeType_id)) {
      model.chargeTimeType = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.ChargeTimeType.class).where()
          .and(com.mifos.objects.client.ChargeTimeType_Table.id.eq(cursor.getInt(indexchargeTimeType_id))).querySingle();
    }
    //// Only load model if references match, for efficiency
    int indexchargeDueDate_clientId = cursor.getColumnIndex("chargeDueDate_clientId");
    int indexchargeDueDate_chargeId = cursor.getColumnIndex("chargeDueDate_chargeId");
    if (indexchargeDueDate_clientId != -1 && !cursor.isNull(indexchargeDueDate_clientId) && indexchargeDueDate_chargeId != -1 && !cursor.isNull(indexchargeDueDate_chargeId)) {
      model.chargeDueDate = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.ClientDate.class).where()
          .and(com.mifos.objects.client.ClientDate_Table.clientId.eq(cursor.getLong(indexchargeDueDate_clientId)))
          .and(com.mifos.objects.client.ClientDate_Table.chargeId.eq(cursor.getLong(indexchargeDueDate_chargeId))).querySingle();
    }
    //// Only load model if references match, for efficiency
    int indexchargeCalculationType_id = cursor.getColumnIndex("chargeCalculationType_id");
    if (indexchargeCalculationType_id != -1 && !cursor.isNull(indexchargeCalculationType_id)) {
      model.chargeCalculationType = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.ChargeCalculationType.class).where()
          .and(com.mifos.objects.client.ChargeCalculationType_Table.id.eq(cursor.getInt(indexchargeCalculationType_id))).querySingle();
    }
    //// Only load model if references match, for efficiency
    int indexcurrency_code = cursor.getColumnIndex("currency_code");
    if (indexcurrency_code != -1 && !cursor.isNull(indexcurrency_code)) {
      model.currency = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.client.Currency.class).where()
          .and(com.mifos.objects.client.Currency_Table.code.eq(cursor.getString(indexcurrency_code))).querySingle();
    }
    int indexamount = cursor.getColumnIndex("amount");
    if (indexamount != -1 && !cursor.isNull(indexamount)) {
      model.amount = cursor.getDouble(indexamount);
    } else {
      model.amount = null;
    }
    int indexamountPaid = cursor.getColumnIndex("amountPaid");
    if (indexamountPaid != -1 && !cursor.isNull(indexamountPaid)) {
      model.amountPaid = cursor.getDouble(indexamountPaid);
    } else {
      model.amountPaid = null;
    }
    int indexamountWaived = cursor.getColumnIndex("amountWaived");
    if (indexamountWaived != -1 && !cursor.isNull(indexamountWaived)) {
      model.amountWaived = cursor.getDouble(indexamountWaived);
    } else {
      model.amountWaived = null;
    }
    int indexamountWrittenOff = cursor.getColumnIndex("amountWrittenOff");
    if (indexamountWrittenOff != -1 && !cursor.isNull(indexamountWrittenOff)) {
      model.amountWrittenOff = cursor.getDouble(indexamountWrittenOff);
    } else {
      model.amountWrittenOff = null;
    }
    int indexamountOutstanding = cursor.getColumnIndex("amountOutstanding");
    if (indexamountOutstanding != -1 && !cursor.isNull(indexamountOutstanding)) {
      model.amountOutstanding = cursor.getDouble(indexamountOutstanding);
    } else {
      model.amountOutstanding = null;
    }
    int indexpenalty = cursor.getColumnIndex("penalty");
    if (indexpenalty != -1 && !cursor.isNull(indexpenalty)) {
      model.penalty = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexpenalty));
    } else {
      model.penalty = null;
    }
    int indexisActive = cursor.getColumnIndex("isActive");
    if (indexisActive != -1 && !cursor.isNull(indexisActive)) {
      model.isActive = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisActive));
    } else {
      model.isActive = null;
    }
    int indexisPaid = cursor.getColumnIndex("isPaid");
    if (indexisPaid != -1 && !cursor.isNull(indexisPaid)) {
      model.isPaid = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisPaid));
    } else {
      model.isPaid = null;
    }
    int indexisWaived = cursor.getColumnIndex("isWaived");
    if (indexisWaived != -1 && !cursor.isNull(indexisWaived)) {
      model.isWaived = (java.lang.Boolean) com.raizlabs.android.dbflow.config.FlowManager.getTypeConverterForClass(java.lang.Boolean.class).getModelValue(cursor.getInt(indexisWaived));
    } else {
      model.isWaived = null;
    }
  }

  @Override
  public final boolean exists(Charges model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Charges.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Charges model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Charges_Table.id.eq(model.id));return clause;
  }

  @Override
  public final Charges newInstance() {
    return new Charges();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Charges_Table.getProperty(name);
  }
}
