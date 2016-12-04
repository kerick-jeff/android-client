// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.createnewgroup;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CreateNewGroupFragment$$ViewBinder<T extends CreateNewGroupFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558745, "field 'et_groupName'");
    target.et_groupName = finder.castView(view, 2131558745, "field 'et_groupName'");
    view = finder.findRequiredView(source, 2131558748, "field 'et_groupexternalId'");
    target.et_groupexternalId = finder.castView(view, 2131558748, "field 'et_groupexternalId'");
    view = finder.findRequiredView(source, 2131558749, "field 'cb_groupActiveStatus'");
    target.cb_groupActiveStatus = finder.castView(view, 2131558749, "field 'cb_groupActiveStatus'");
    view = finder.findRequiredView(source, 2131558747, "field 'tv_submissionDate'");
    target.tv_submissionDate = finder.castView(view, 2131558747, "field 'tv_submissionDate'");
    view = finder.findRequiredView(source, 2131558750, "field 'tv_activationDate'");
    target.tv_activationDate = finder.castView(view, 2131558750, "field 'tv_activationDate'");
    view = finder.findRequiredView(source, 2131558746, "field 'sp_offices'");
    target.sp_offices = finder.castView(view, 2131558746, "field 'sp_offices'");
    view = finder.findRequiredView(source, 2131558674, "field 'bt_submit'");
    target.bt_submit = finder.castView(view, 2131558674, "field 'bt_submit'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CreateNewGroupFragment> implements Unbinder {
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
      target.et_groupName = null;
      target.et_groupexternalId = null;
      target.cb_groupActiveStatus = null;
      target.tv_submissionDate = null;
      target.tv_activationDate = null;
      target.sp_offices = null;
      target.bt_submit = null;
    }
  }
}
