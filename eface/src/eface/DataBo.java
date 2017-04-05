package eface;

import java.util.List;

import eface.model.*;

public class DataBo {
	
	private List<MorDetailList> morDetailList;
	private List<BasicList> basicList;
	private List<CaseInfoList> caseInfoList;
	private List<PersonList> personList;
	private List<FrPositionList> frPositionList;
	private List<SharesFrostList> sharesFrostList;
	private List<EntinvItemList> entinvItemList;
	private List<SharesImpawnList> sharesImpawnList;
	private List<PunishBreakList> punishBreakList;
	private List<FiliationList> filiationList;
	private List<PunishedList> punishedList;
	private List<ShareHolderList> shareHolderList;
	private List<AlterList> alterList;
	
	public DataBo() {
		
	}
	
	public DataBo(List<MorDetailList> morDetailList,List<BasicList> basicList,List<CaseInfoList> caseInfoList,List<PersonList> personList,List<FrPositionList> frPositionList,List<SharesFrostList> sharesFrostList,List<EntinvItemList> entinvItemList,List<SharesImpawnList> sharesImpawnList,List<PunishBreakList> punishBreakList,List<FiliationList> filiationList,List<PunishedList> punishedList,List<ShareHolderList> shareHolderList,List<AlterList> alterList){
		this.morDetailList=morDetailList;
		this.basicList=basicList;
		this.caseInfoList=caseInfoList;
		this.personList=personList;
		this.frPositionList=frPositionList;
		this.sharesFrostList=sharesFrostList;
		this.entinvItemList=entinvItemList;
		this.sharesImpawnList=sharesImpawnList;
		this.punishBreakList=punishBreakList;
		this.filiationList=filiationList;
		this.punishedList=punishedList;
		this.shareHolderList=shareHolderList;
		this.alterList=alterList;
	}
	
	public List<MorDetailList> getMorDetailList() {
		return morDetailList;
	}
	public void setMorDetailList(List<MorDetailList> morDetailList) {
		this.morDetailList = morDetailList;
	}
	public List<BasicList> getBasicList() {
		return basicList;
	}
	public void setBasicList(List<BasicList> basicList) {
		this.basicList = basicList;
	}
	public List<CaseInfoList> getCaseInfoList() {
		return caseInfoList;
	}
	public void setCaseInfoList(List<CaseInfoList> caseInfoList) {
		this.caseInfoList = caseInfoList;
	}
	public List<PersonList> getPersonList() {
		return personList;
	}
	public void setPersonList(List<PersonList> personList) {
		this.personList = personList;
	}
	public List<FrPositionList> getFrPositionList() {
		return frPositionList;
	}
	public void setFrPositionList(List<FrPositionList> frPositionList) {
		this.frPositionList = frPositionList;
	}
	public List<SharesFrostList> getSharesFrostList() {
		return sharesFrostList;
	}
	public void setSharesFrostList(List<SharesFrostList> sharesFrostList) {
		this.sharesFrostList = sharesFrostList;
	}
	public List<EntinvItemList> getEntinvItemList() {
		return entinvItemList;
	}
	public void setEntinvItemList(List<EntinvItemList> entinvItemList) {
		this.entinvItemList = entinvItemList;
	}
	public List<SharesImpawnList> getSharesImpawnList() {
		return sharesImpawnList;
	}
	public void setSharesImpawnList(List<SharesImpawnList> sharesImpawnList) {
		this.sharesImpawnList = sharesImpawnList;
	}
	public List<FiliationList> getFiliationList() {
		return filiationList;
	}
	public void setFiliationList(List<FiliationList> filiationList) {
		this.filiationList = filiationList;
	}
	public List<ShareHolderList> getShareHolderList() {
		return shareHolderList;
	}
	public void setShareHolderList(List<ShareHolderList> shareHolderList) {
		this.shareHolderList = shareHolderList;
	}
	public List<AlterList> getAlterList() {
		return alterList;
	}
	public void setAlterList(List<AlterList> alterList) {
		this.alterList = alterList;
	}
	public List<PunishBreakList> getPunishBreakList() {
		return punishBreakList;
	}
	public void setPunishBreakList(List<PunishBreakList> punishBreakList) {
		this.punishBreakList = punishBreakList;
	}
	public List<PunishedList> getPunishedList() {
		return punishedList;
	}
	public void setPunishedList(List<PunishedList> punishedList) {
		this.punishedList = punishedList;
	}
	 
}
