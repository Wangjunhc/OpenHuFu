package com.hufudb.openhufu.implementor;

import com.hufudb.openhufu.plan.BinaryPlan;
import com.hufudb.openhufu.plan.LeafPlan;
import com.hufudb.openhufu.plan.Plan;
import com.hufudb.openhufu.plan.UnaryPlan;
import com.hufudb.openhufu.data.storage.DataSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface PlanImplementor {
  static final Logger LOG = LoggerFactory.getLogger(PlanImplementor.class);

  DataSet implement(Plan plan);
  DataSet leafQuery(LeafPlan plan);
  DataSet unaryQuery(UnaryPlan plan);
  DataSet binaryQuery(BinaryPlan plan);
}
