// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.createnewclient;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CreateNewClientFragment$$ViewBinder<T extends CreateNewClientFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558728, "field 'et_clientFirstName'");
    target.et_clientFirstName = finder.castView(view, 2131558728, "field 'et_clientFirstName'");
    view = finder.findRequiredView(source, 2131558730, "field 'et_clientLastName'");
    target.et_clientLastName = finder.castView(view, 2131558730, "field 'et_clientLastName'");
    view = finder.findRequiredView(source, 2131558729, "field 'et_clientMiddleName'");
    target.et_clientMiddleName = finder.castView(view, 2131558729, "field 'et_clientMiddleName'");
    view = finder.findRequiredView(source, 2131558731, "field 'et_clientMobileNo'");
    target.et_clientMobileNo = finder.castView(view, 2131558731, "field 'et_clientMobileNo'");
    view = finder.findRequiredView(source, 2131558640, "field 'et_clientexternalId'");
    target.et_clientexternalId = finder.castView(view, 2131558640, "field 'et_clientexternalId'");
    view = finder.findRequiredView(source, 2131558743, "field 'cb_clientActiveStatus'");
    target.cb_clientActiveStatus = finder.castView(view, 2131558743, "field 'cb_clientActiveStatus'");
    view = finder.findRequiredView(source, 2131558744, "field 'tv_submissionDate'");
    target.tv_submissionDate = finder.castView(view, 2131558744, "field 'tv_submissionDate'");
    view = finder.findRequiredView(source, 2131558735, "field 'tv_dateofbirth'");
    target.tv_dateofbirth = finder.castView(view, 2131558735, "field 'tv_dateofbirth'");
    view = finder.findRequiredView(source, 2131558740, "field 'sp_offices'");
    target.sp_offices = finder.castView(view, 2131558740, "field 'sp_offices'");
    view = finder.findRequiredView(source, 2131558733, "field 'spGender'");
    target.spGender = finder.castView(view, 2131558733, "field 'spGender'");
    view = finder.findRequiredView(source, 2131558737, "field 'spClientType'");
    target.spClientType = finder.castView(view, 2131558737, "field 'spClientType'");
    view = finder.findRequiredView(source, 2131558742, "field 'sp_staff'");
    target.sp_staff = finder.castView(view, 2131558742, "field 'sp_staff'");
    view = finder.findRequiredView(source, 2131558739, "field 'spClientClassification'");
    target.spClientClassification = finder.castView(view, 2131558739, "field 'spClientClassification'");
    view = finder.findRequiredView(source, 2131558674, "field 'bt_submit'");
    target.bt_submit = finder.castView(view, 2131558674, "field 'bt_submit'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CreateNewClientFragment> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.et_clientFirstName = null;
      target.et_clientLastName = null;
      target.et_clientMiddleName = null;
      target.et_clientMobileNo = null;
      target.et_clientexternalId = null;
      target.cb_clientActiveStatus = null;
      target.tv_submissionDate = null;
      target.tv_dateofbirth = null;
      target.sp_offices = null;
      target.spGender = null;
      target.spClientType = null;
      target.sp_staff = null;
      target.spClientClassification = null;
      target.bt_submit = null;
    }
  }
}
