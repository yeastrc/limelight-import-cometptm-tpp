package org.yeastrc.limelight.xml.cometptm_tpp.objects;

import java.math.BigDecimal;
import java.util.Map;

public class TPPPSM {

	private BigDecimal evalue;
	private BigDecimal xcorr;
	private BigDecimal deltaCn;
	private BigDecimal deltaCnStar;
	private BigDecimal spscore;
	private BigDecimal sprank;
	private BigDecimal massDiff;

	private BigDecimal peptideProphetProbability;
	private BigDecimal interProphetProbability;

	private BigDecimal positionProbability;		// from PTM prophet
	private String ptmProphetPeptideString;		// from PTM prophet

	private int hitRank;
	
	private int scanNumber;
	private BigDecimal precursorNeutralMass;
	private int charge;
	private BigDecimal retentionTime;
	
	private String peptideSequence;
	
	private Map<Integer,BigDecimal> modifications;
	
	private BigDecimal peptideProphetFDR;
	private BigDecimal interProphetFDR;

	public String getPtmProphetPeptideString() {
		return ptmProphetPeptideString;
	}

	public void setPtmProphetPeptideString(String ptmProphetPeptideString) {
		this.ptmProphetPeptideString = ptmProphetPeptideString;
	}

	public BigDecimal getEvalue() {
		return evalue;
	}

	public void setEvalue(BigDecimal evalue) {
		this.evalue = evalue;
	}

	public BigDecimal getXcorr() {
		return xcorr;
	}

	public void setXcorr(BigDecimal xcorr) {
		this.xcorr = xcorr;
	}

	public BigDecimal getDeltaCn() {
		return deltaCn;
	}

	public void setDeltaCn(BigDecimal deltaCn) {
		this.deltaCn = deltaCn;
	}

	public BigDecimal getDeltaCnStar() {
		return deltaCnStar;
	}

	public void setDeltaCnStar(BigDecimal deltaCnStar) {
		this.deltaCnStar = deltaCnStar;
	}

	public BigDecimal getSpscore() {
		return spscore;
	}

	public void setSpscore(BigDecimal spscore) {
		this.spscore = spscore;
	}

	public BigDecimal getSprank() {
		return sprank;
	}

	public void setSprank(BigDecimal sprank) {
		this.sprank = sprank;
	}

	public BigDecimal getMassDiff() {
		return massDiff;
	}

	public void setMassDiff(BigDecimal massDiff) {
		this.massDiff = massDiff;
	}

	public BigDecimal getPositionProbability() {
		return positionProbability;
	}

	public void setPositionProbability(BigDecimal positionProbability) {
		this.positionProbability = positionProbability;
	}

	public BigDecimal getPeptideProphetProbability() {
		return peptideProphetProbability;
	}

	public void setPeptideProphetProbability(BigDecimal peptideProphetProbability) {
		this.peptideProphetProbability = peptideProphetProbability;
	}

	public BigDecimal getInterProphetProbability() {
		return interProphetProbability;
	}

	public void setInterProphetProbability(BigDecimal interProphetProbability) {
		this.interProphetProbability = interProphetProbability;
	}

	public int getHitRank() {
		return hitRank;
	}

	public void setHitRank(int hitRank) {
		this.hitRank = hitRank;
	}

	public int getScanNumber() {
		return scanNumber;
	}

	public void setScanNumber(int scanNumber) {
		this.scanNumber = scanNumber;
	}

	public BigDecimal getPrecursorNeutralMass() {
		return precursorNeutralMass;
	}

	public void setPrecursorNeutralMass(BigDecimal precursorNeutralMass) {
		this.precursorNeutralMass = precursorNeutralMass;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public BigDecimal getRetentionTime() {
		return retentionTime;
	}

	public void setRetentionTime(BigDecimal retentionTime) {
		this.retentionTime = retentionTime;
	}

	public String getPeptideSequence() {
		return peptideSequence;
	}

	public void setPeptideSequence(String peptideSequence) {
		this.peptideSequence = peptideSequence;
	}

	public Map<Integer, BigDecimal> getModifications() {
		return modifications;
	}

	public void setModifications(Map<Integer, BigDecimal> modifications) {
		this.modifications = modifications;
	}

	public BigDecimal getPeptideProphetFDR() {
		return peptideProphetFDR;
	}

	public void setPeptideProphetFDR(BigDecimal peptideProphetFDR) {
		this.peptideProphetFDR = peptideProphetFDR;
	}

	public BigDecimal getInterProphetFDR() {
		return interProphetFDR;
	}

	public void setInterProphetFDR(BigDecimal interProphetFDR) {
		this.interProphetFDR = interProphetFDR;
	}
}
