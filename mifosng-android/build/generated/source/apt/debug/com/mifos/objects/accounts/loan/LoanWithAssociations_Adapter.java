package com.mifos.objects.accounts.loan;

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

public final class LoanWithAssociations_Adapter extends ModelAdapter<LoanWithAssociations> {
  public LoanWithAssociations_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<LoanWithAssociations> getModelClass() {
    return LoanWithAssociations.class;
  }

  public final String getTableName() {
    return "`LoanWithAssociations`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return LoanWithAssociations_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, LoanWithAssociations model) {
    if (model.id != null) {
      values.put(LoanWithAssociations_Table.id.getCursorKey(), model.id);
    } else {
      values.putNull(LoanWithAssociations_Table.id.getCursorKey());
    }
    if (model.accountNo != null) {
      values.put(LoanWithAssociations_Table.accountNo.getCursorKey(), model.accountNo);
    } else {
      values.putNull(LoanWithAssociations_Table.accountNo.getCursorKey());
    }
    if (model.status != null) {
      model.status.save();
      if (model.status.id != null) {
        values.put(LoanWithAssociations_Table.status_id.getCursorKey(), model.status.id);
      } else {
        values.putNull(LoanWithAssociations_Table.status_id.getCursorKey());
      }
    } else {
      values.putNull("`status_id`");
    }
    if (model.clientName != null) {
      values.put(LoanWithAssociations_Table.clientName.getCursorKey(), model.clientName);
    } else {
      values.putNull(LoanWithAssociations_Table.clientName.getCursorKey());
    }
    if (model.loanProductName != null) {
      values.put(LoanWithAssociations_Table.loanProductName.getCursorKey(), model.loanProductName);
    } else {
      values.putNull(LoanWithAssociations_Table.loanProductName.getCursorKey());
    }
    if (model.loanOfficerName != null) {
      values.put(LoanWithAssociations_Table.loanOfficerName.getCursorKey(), model.loanOfficerName);
    } else {
      values.putNull(LoanWithAssociations_Table.loanOfficerName.getCursorKey());
    }
    if (model.timeline != null) {
      model.timeline.save();
      if (model.timeline.loanId != null) {
        values.put(LoanWithAssociations_Table.timeline_loanId.getCursorKey(), model.timeline.loanId);
      } else {
        values.putNull(LoanWithAssociations_Table.timeline_loanId.getCursorKey());
      }
    } else {
      values.putNull("`timeline_loanId`");
    }
    if (model.summary != null) {
      model.summary.save();
      if (model.summary.loanId != null) {
        values.put(LoanWithAssociations_Table.summary_loanId.getCursorKey(), model.summary.loanId);
      } else {
        values.putNull(LoanWithAssociations_Table.summary_loanId.getCursorKey());
      }
    } else {
      values.putNull("`summary_loanId`");
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, LoanWithAssociations model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, LoanWithAssociations model, int start) {
    if (model.id != null) {
      statement.bindLong(1 + start, model.id);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.accountNo != null) {
      statement.bindString(2 + start, model.accountNo);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.status != null) {
      model.status.save();
      if (model.status.id != null) {
        statement.bindLong(3 + start, model.status.id);
      } else {
        statement.bindNull(3 + start);
      }
    } else {
      statement.bindNull(3 + start);
    }
    if (model.clientName != null) {
      statement.bindString(4 + start, model.clientName);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.loanProductName != null) {
      statement.bindString(5 + start, model.loanProductName);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.loanOfficerName != null) {
      statement.bindString(6 + start, model.loanOfficerName);
    } else {
      statement.bindNull(6 + start);
    }
    if (model.timeline != null) {
      model.timeline.save();
      if (model.timeline.loanId != null) {
        statement.bindLong(7 + start, model.timeline.loanId);
      } else {
        statement.bindNull(7 + start);
      }
    } else {
      statement.bindNull(7 + start);
    }
    if (model.summary != null) {
      model.summary.save();
      if (model.summary.loanId != null) {
        statement.bindLong(8 + start, model.summary.loanId);
      } else {
        statement.bindNull(8 + start);
      }
    } else {
      statement.bindNull(8 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, LoanWithAssociations model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `LoanWithAssociations`(`id`,`accountNo`,`status_id`,`clientName`,`loanProductName`,`loanOfficerName`,`timeline_loanId`,`summary_loanId`) VALUES (?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `LoanWithAssociations`(`id`,`accountNo`,`status_id`,`clientName`,`loanProductName`,`loanOfficerName`,`timeline_loanId`,`summary_loanId`) VALUES (?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `LoanWithAssociations`(`id` INTEGER,`accountNo` TEXT,`status_id` INTEGER,`clientName` TEXT,`loanProductName` TEXT,`loanOfficerName` TEXT,`timeline_loanId` INTEGER,`summary_loanId` INTEGER, PRIMARY KEY(`id`)"+ ", FOREIGN KEY(`status_id`) REFERENCES " + FlowManager.getTableName(Status.class) + "(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`timeline_loanId`) REFERENCES " + FlowManager.getTableName(Timeline.class) + "(`loanId`) ON UPDATE NO ACTION ON DELETE NO ACTION"+ ", FOREIGN KEY(`summary_loanId`) REFERENCES " + FlowManager.getTableName(Summary.class) + "(`loanId`) ON UPDATE NO ACTION ON DELETE NO ACTION" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, LoanWithAssociations model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = null;
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
      model.status = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.Status.class).where()
          .and(com.mifos.objects.accounts.loan.Status_Table.id.eq(cursor.getInt(indexstatus_id))).querySingle();
    }
    int indexclientName = cursor.getColumnIndex("clientName");
    if (indexclientName != -1 && !cursor.isNull(indexclientName)) {
      model.clientName = cursor.getString(indexclientName);
    } else {
      model.clientName = null;
    }
    int indexloanProductName = cursor.getColumnIndex("loanProductName");
    if (indexloanProductName != -1 && !cursor.isNull(indexloanProductName)) {
      model.loanProductName = cursor.getString(indexloanProductName);
    } else {
      model.loanProductName = null;
    }
    int indexloanOfficerName = cursor.getColumnIndex("loanOfficerName");
    if (indexloanOfficerName != -1 && !cursor.isNull(indexloanOfficerName)) {
      model.loanOfficerName = cursor.getString(indexloanOfficerName);
    } else {
      model.loanOfficerName = null;
    }
    //// Only load model if references match, for efficiency
    int indextimeline_loanId = cursor.getColumnIndex("timeline_loanId");
    if (indextimeline_loanId != -1 && !cursor.isNull(indextimeline_loanId)) {
      model.timeline = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.Timeline.class).where()
          .and(com.mifos.objects.accounts.loan.Timeline_Table.loanId.eq(cursor.getInt(indextimeline_loanId))).querySingle();
    }
    //// Only load model if references match, for efficiency
    int indexsummary_loanId = cursor.getColumnIndex("summary_loanId");
    if (indexsummary_loanId != -1 && !cursor.isNull(indexsummary_loanId)) {
      model.summary = new com.raizlabs.android.dbflow.sql.language.Select().from(com.mifos.objects.accounts.loan.Summary.class).where()
          .and(com.mifos.objects.accounts.loan.Summary_Table.loanId.eq(cursor.getInt(indexsummary_loanId))).querySingle();
    }
  }

  @Override
  public final boolean exists(LoanWithAssociations model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(LoanWithAssociations.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(LoanWithAssociations model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(LoanWithAssociations_Table.id.eq(model.id));return clause;
  }

  @Override
  public final LoanWithAssociations newInstance() {
    return new LoanWithAssociations();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return LoanWithAssociations_Table.getProperty(name);
  }
}
