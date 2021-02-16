package org.yeastrc.limelight.xml.cometptm_tpp.annotation;

import org.yeastrc.limelight.limelight_import.api.xml_dto.FilterDirectionType;
import org.yeastrc.limelight.limelight_import.api.xml_dto.FilterablePsmAnnotationType;
import org.yeastrc.limelight.xml.cometptm_tpp.constants.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class PSMAnnotationTypes {

	// comet scores
	// magnum scores
	public static final String COMET_ANNOTATION_TYPE_EVALUE = "E-Value";
	public static final String COMET_ANNOTATION_TYPE_XCORR = "XCorr";
	public static final String COMET_ANNOTATION_TYPE_DELTACN = "deltaCN";
	public static final String COMET_ANNOTATION_TYPE_DELTACNSTAR= "deltaCN*";
	public static final String COMET_ANNOTATION_TYPE_SPSCORE = "sp Score";
	public static final String COMET_ANNOTATION_TYPE_SPRANK = "sp Rank";

	public static final String COMET_ANNOTATION_TYPE_MASSDIFF = "Mass Diff";
	
	// PeptideProphet scores
	public static final String PPROPHET_ANNOTATION_TYPE_SCORE = "Probability Score";
	public static final String PPROPHET_ANNOTATION_TYPE_FDR = "Calculated FDR";
	
	// InterProphet scores
	public static final String IPROPHET_ANNOTATION_TYPE_SCORE = "Probability Score";
	public static final String IPROPHET_ANNOTATION_TYPE_FDR = "Calculated FDR";
	
	public static List<FilterablePsmAnnotationType> getFilterablePsmAnnotationTypes( String programName ) {
		List<FilterablePsmAnnotationType> types = new ArrayList<FilterablePsmAnnotationType>();

		if( programName.equals( Constants.PROGRAM_NAME_COMET_PTM ) ) {

			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( COMET_ANNOTATION_TYPE_EVALUE );
				type.setDescription( "Expect value" );
				type.setFilterDirection( FilterDirectionType.BELOW );

				types.add( type );
			}

			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( COMET_ANNOTATION_TYPE_XCORR );
				type.setDescription( "Cross correlation score" );
				type.setFilterDirection( FilterDirectionType.ABOVE );

				types.add( type );
			}

			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( COMET_ANNOTATION_TYPE_DELTACN );
				type.setDescription( "Difference between this PSM and next highest scoring PSM for this scan" );
				type.setFilterDirection( FilterDirectionType.ABOVE );

				types.add( type );
			}

			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( COMET_ANNOTATION_TYPE_DELTACNSTAR );
				type.setDescription( "Difference between this PSM and next highest scoring PSM for this scan" );
				type.setFilterDirection( FilterDirectionType.ABOVE );

				types.add( type );
			}

			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( COMET_ANNOTATION_TYPE_SPSCORE );
				type.setDescription( "Sp Score" );
				type.setFilterDirection( FilterDirectionType.ABOVE );

				types.add( type );
			}

			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( COMET_ANNOTATION_TYPE_SPRANK );
				type.setDescription( "Sp rank" );
				type.setFilterDirection( FilterDirectionType.ABOVE );

				types.add( type );
			}

			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( COMET_ANNOTATION_TYPE_MASSDIFF );
				type.setDescription( "Difference in between mass of predicted peptide and observed spectrum mass" );
				type.setFilterDirection( FilterDirectionType.BELOW );

				types.add( type );
			}

		}

		else if( programName.equals( Constants.PROGRAM_NAME_PEPTIDEPROPHET ) ) {
			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( PPROPHET_ANNOTATION_TYPE_SCORE );
				type.setDescription( "PeptideProphet Probability Score" );
				type.setFilterDirection( FilterDirectionType.ABOVE );
	
				types.add( type );
			}
			
			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( PPROPHET_ANNOTATION_TYPE_FDR );
				type.setDescription( "Calculated FDR from PeptideProphet Probability Score" );
				type.setFilterDirection( FilterDirectionType.BELOW );
				type.setDefaultFilterValue( new BigDecimal( "0.01" ) );
	
				types.add( type );
			}
		}
		
		else if( programName.equals( Constants.PROGRAM_NAME_INTERPROPHET ) ) {
			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( IPROPHET_ANNOTATION_TYPE_SCORE );
				type.setDescription( "InterProphet Probability Score" );
				type.setFilterDirection( FilterDirectionType.ABOVE );
	
				types.add( type );
			}
			
			{
				FilterablePsmAnnotationType type = new FilterablePsmAnnotationType();
				type.setName( IPROPHET_ANNOTATION_TYPE_FDR );
				type.setDescription( "Calculated FDR from InterProphet Probability Score" );
				type.setFilterDirection( FilterDirectionType.BELOW );
				type.setDefaultFilterValue( new BigDecimal( "0.01" ) );
	
				types.add( type );
			}
		}
		
		return types;
	}
	
	
}
