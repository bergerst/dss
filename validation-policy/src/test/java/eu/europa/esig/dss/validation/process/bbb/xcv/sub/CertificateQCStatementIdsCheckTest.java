package eu.europa.esig.dss.validation.process.bbb.xcv.sub;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import eu.europa.esig.dss.jaxb.detailedreport.XmlConstraint;
import eu.europa.esig.dss.jaxb.detailedreport.XmlStatus;
import eu.europa.esig.dss.jaxb.detailedreport.XmlSubXCV;
import eu.europa.esig.dss.jaxb.diagnostic.XmlCertificate;
import eu.europa.esig.dss.validation.process.bbb.xcv.sub.checks.CertificateQCStatementIdsCheck;
import eu.europa.esig.dss.validation.reports.wrapper.CertificateWrapper;
import eu.europa.esig.jaxb.policy.Level;
import eu.europa.esig.jaxb.policy.MultiValuesConstraint;

public class CertificateQCStatementIdsCheckTest {

	@Test
	public void certificateQCStatementCheck() throws Exception {
		List<String> qcStatementIds = new ArrayList<String>();
		qcStatementIds.add("0.4.0.1862.1.1");

		MultiValuesConstraint constraint = new MultiValuesConstraint();
		constraint.setLevel(Level.FAIL);
		constraint.getId().add(qcStatementIds.get(0));

		XmlCertificate xc = new XmlCertificate();
		xc.setQCStatementIds(qcStatementIds);

		XmlSubXCV result = new XmlSubXCV();
		CertificateQCStatementIdsCheck fc = new CertificateQCStatementIdsCheck(result, new CertificateWrapper(xc),
				constraint);
		fc.execute();

		List<XmlConstraint> constraints = result.getConstraint();
		assertEquals(1, constraints.size());
		assertEquals(XmlStatus.OK, constraints.get(0).getStatus());
	}

	@Test
	public void failedCertificateQCStatementCheck() throws Exception {
		List<String> qcStatementIds = new ArrayList<String>();
		qcStatementIds.add("0.4.0.1862.1.1");

		MultiValuesConstraint constraint = new MultiValuesConstraint();
		constraint.setLevel(Level.FAIL);
		constraint.getId().add("0.4.0.1862.1.2");

		XmlCertificate xc = new XmlCertificate();
		xc.setQCStatementIds(qcStatementIds);

		XmlSubXCV result = new XmlSubXCV();
		CertificateQCStatementIdsCheck fc = new CertificateQCStatementIdsCheck(result, new CertificateWrapper(xc),
				constraint);
		fc.execute();

		List<XmlConstraint> constraints = result.getConstraint();
		assertEquals(1, constraints.size());
		assertEquals(XmlStatus.NOT_OK, constraints.get(0).getStatus());
	}

}
