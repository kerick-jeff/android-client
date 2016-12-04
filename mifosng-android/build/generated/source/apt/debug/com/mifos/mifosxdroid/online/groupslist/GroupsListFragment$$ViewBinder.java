// Generated code from Butter Knife. Do not modify!
package com.mifos.mifosxdroid.online.groupslist;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class GroupsListFragment$$ViewBinder<T extends GroupsListFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131558778, "field 'rv_groups'");
    target.rv_groups = finder.castView(view, 2131558778, "field 'rv_groups'");
    view = finder.findRequiredView(source, 2131558779, "field 'pb_groups'");
    target.pb_groups = finder.castView(view, 2131558779, "field 'pb_groups'");
    view = finder.findRequiredView(source, 2131558678, "field 'swipeRefreshLayout'");
    target.swipeRefreshLayout = finder.castView(view, 2131558678, "field 'swipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131558781, "field 'mNoGroupsText'");
    target.mNoGroupsText = finder.castView(view, 2131558781, "field 'mNoGroupsText'");
    view = finder.findRequiredView(source, 2131558780, "field 'mNoGroupIcon' and method 'reloadOnError'");
    target.mNoGroupIcon = finder.castView(view, 2131558780, "field 'mNoGroupIcon'");
    unbinder.view2131558780 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.reloadOnError();
      }
    });
    view = finder.findRequiredView(source, 2131558681, "field 'll_error'");
    target.ll_error = finder.castView(view, 2131558681, "field 'll_error'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends GroupsListFragment> implements Unbinder {
    private T target;

    View view2131558780;

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
      target.rv_groups = null;
      target.pb_groups = null;
      target.swipeRefreshLayout = null;
      target.mNoGroupsText = null;
      view2131558780.setOnClickListener(null);
      target.mNoGroupIcon = null;
      target.ll_error = null;
    }
  }
}
