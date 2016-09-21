package eu.europa.esig.dss.validation.process.bbb.xcv.sub;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import eu.europa.esig.dss.jaxb.detailedreport.XmlConstraint;
import eu.europa.esig.dss.jaxb.detailedreport.XmlStatus;
import eu.europa.esig.dss.jaxb.detailedreport.XmlSubXCV;
import eu.europa.esig.dss.jaxb.diagnostic.XmlCertificate;
import eu.europa.esig.dss.validation.process.bbb.xcv.sub.checks.CertificatePolicyIdsCheck;
import eu.europa.esig.dss.validation.reports.wrapper.CertificateWrapper;
import eu.europa.esig.jaxb.policy.Level;
import eu.europa.esig.jaxb.policy.MultiValuesConstraint;

public class CertificatePolicyIdsCheckTest {

	@Test
	public void certificatePolicyIdsCheck() throws Exception {
		List<String> policyIds = new ArrayList<String>();
		policyIds.add("1.3.76.38.1.1.1");

		MultiValuesConstraint constraint = new MultiValuesConstraint();
		constraint.setLevel(Level.FAIL);
		constraint.getId().add(policyIds.get(0));

		XmlCertificate xc = new XmlCertificate();
		xc.setCertificatePolicyIds(policyIds);

		XmlSubXCV result = new XmlSubXCV();
		CertificatePolicyIdsCheck fc = new CertificatePolicyIdsCheck(result, new CertificateWrapper(xc), constraint);
		fc.execute();

		List<XmlConstraint> constraints = result.getConstraint();
		assertEquals(1, constraints.size());
		assertEquals(XmlStatus.OK, constraints.get(0).getStatus());
	}

	@Test
	public void failedCertificatePolicyIdsCheck() throws Exception {
		List<String> policyIds = new ArrayList<String>();
		policyIds.add("1.3.76.38.1.1.1");

		MultiValuesConstraint constraint = new MultiValuesConstraint();
		constraint.setLevel(Level.FAIL);
		constraint.getId().add("1.3.76.38.1.1.2");

		XmlCertificate xc = new XmlCertificate();
		xc.setCertificatePolicyIds(policyIds);

		XmlSubXCV result = new XmlSubXCV();
		CertificatePolicyIdsCheck fc = new CertificatePolicyIdsCheck(result, new CertificateWrapper(xc), constraint);
		fc.execute();

		List<XmlConstraint> constraints = result.getConstraint();
		assertEquals(1, constraints.size());
		assertEquals(XmlStatus.NOT_OK, constraints.get(0).getStatus());
	}

}
