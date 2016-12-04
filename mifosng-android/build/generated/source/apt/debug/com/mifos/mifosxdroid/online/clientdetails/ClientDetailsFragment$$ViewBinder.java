// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.clientdetails;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ClientDetailsFragment$$ViewBinder<T extends ClientDetailsFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558694, "field 'tv_fullName'");
    target.tv_fullName = finder.castView(view, 2131558694, "field 'tv_fullName'");
    view = finder.findRequiredView(source, 2131558697, "field 'tv_accountNumber'");
    target.tv_accountNumber = finder.castView(view, 2131558697, "field 'tv_accountNumber'");
    view = finder.findRequiredView(source, 2131558699, "field 'tv_externalId'");
    target.tv_externalId = finder.castView(view, 2131558699, "field 'tv_externalId'");
    view = finder.findRequiredView(source, 2131558701, "field 'tv_activationDate'");
    target.tv_activationDate = finder.castView(view, 2131558701, "field 'tv_activationDate'");
    view = finder.findRequiredView(source, 2131558703, "field 'tv_office'");
    target.tv_office = finder.castView(view, 2131558703, "field 'tv_office'");
    view = finder.findRequiredView(source, 2131558693, "field 'iv_clientImage'");
    target.iv_clientImage = finder.castView(view, 2131558693, "field 'iv_clientImage'");
    view = finder.findRequiredView(source, 2131558692, "field 'pb_imageProgressBar'");
    target.pb_imageProgressBar = finder.castView(view, 2131558692, "field 'pb_imageProgressBar'");
    view = finder.findRequiredView(source, 2131558696, "field 'rowAccount'");
    target.rowAccount = finder.castView(view, 2131558696, "field 'rowAccount'");
    view = finder.findRequiredView(source, 2131558698, "field 'rowExternal'");
    target.rowExternal = finder.castView(view, 2131558698, "field 'rowExternal'");
    view = finder.findRequiredView(source, 2131558700, "field 'rowActivation'");
    target.rowActivation = finder.castView(view, 2131558700, "field 'rowActivation'");
    view = finder.findRequiredView(source, 2131558702, "field 'rowOffice'");
    target.rowOffice = finder.castView(view, 2131558702, "field 'rowOffice'");
    view = finder.findRequiredView(source, 2131558704, "field 'rowGroup'");
    target.rowGroup = finder.castView(view, 2131558704, "field 'rowGroup'");
    view = finder.findRequiredView(source, 2131558706, "field 'rowStaff'");
    target.rowStaff = finder.castView(view, 2131558706, "field 'rowStaff'");
    view = finder.findRequiredView(source, 2131558708, "field 'rowLoan'");
    target.rowLoan = finder.castView(view, 2131558708, "field 'rowLoan'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ClientDetailsFragment> implements Unbinder {
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
      target.tv_fullName = null;
      target.tv_accountNumber = null;
      target.tv_externalId = null;
      target.tv_activationDate = null;
      target.tv_office = null;
      target.iv_clientImage = null;
      target.pb_imageProgressBar = null;
      target.rowAccount = null;
      target.rowExternal = null;
      target.rowActivation = null;
      target.rowOffice = null;
      target.rowGroup = null;
      target.rowStaff = null;
      target.rowLoan = null;
    }
  }
}
