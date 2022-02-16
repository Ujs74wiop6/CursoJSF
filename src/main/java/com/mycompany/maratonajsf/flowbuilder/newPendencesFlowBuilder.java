package com.mycompany.maratonajsf.flowbuilder;

import java.io.Serializable;
import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

/**
 *
 * @author Home
 */
public class newPendencesFlowBuilder implements Serializable {

    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "newpendences";
        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/newpendences/newpendences.xhtml").markAsStartNode();
        flowBuilder.returnNode("proceedToNewRegistration3")
                .fromOutcome("/newregistration/newregistration3.xhtml");
        flowBuilder.returnNode("exitToNewInicio")
                .fromOutcome("/newregistration/newregistration.xhtml");
        flowBuilder.inboundParameter("userName", "#{testeFlowBuilderNestedBean.userName}");
        flowBuilder.inboundParameter("userName", "#{testeFlowBuilderNestedBean.userName}");
        return flowBuilder.getFlow();
    }
}
