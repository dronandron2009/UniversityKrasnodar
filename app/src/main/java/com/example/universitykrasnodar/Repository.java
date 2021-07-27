package com.example.universitykrasnodar;

import com.example.universitykrasnodar.data.Fackultet;
import com.example.universitykrasnodar.data.Link;
import com.example.universitykrasnodar.data.Univer;
import static com.example.universitykrasnodar.unitls.utils.UPRAV;
import static com.example.universitykrasnodar.unitls.utils.TECH;
import static com.example.universitykrasnodar.unitls.utils.INFOR;
import static com.example.universitykrasnodar.unitls.utils.MEDZDRAV;
import static com.example.universitykrasnodar.unitls.utils.TOCH;
import static com.example.universitykrasnodar.unitls.utils.GUM;
import static com.example.universitykrasnodar.unitls.utils.BEZ;
import static com.example.universitykrasnodar.unitls.utils.ISSC;
import static com.example.universitykrasnodar.unitls.utils.MEDIA;
import static com.example.universitykrasnodar.unitls.utils.DIS;
import static com.example.universitykrasnodar.unitls.utils.SPHERA;
import static com.example.universitykrasnodar.unitls.utils.MEN;
import static com.example.universitykrasnodar.unitls.utils.BISINFOR;
import static com.example.universitykrasnodar.unitls.utils.UR;
import static com.example.universitykrasnodar.unitls.utils.MED;
import static com.example.universitykrasnodar.unitls.utils.MVD;



import java.util.ArrayList;
public class Repository {

    public Univer[] allUnivers=new Univer[11];

    private static final Repository INSTANCE = new Repository();

    private Repository(){}

    public static Repository getInstance(){
        return INSTANCE;
    }


    public void createData(){
        Fackultet uim1=new Fackultet(1, R.string.Uzhniy_university_managment_fak_econom, R.string.Uzhniy_university_managment_fak_econom_naprav, UPRAV);
        Fackultet uim2=new Fackultet(2, R.string.Uzhniy_university_managment_fak_uridicheskiy, R.string.Uzhniy_university_managment_fak_uridicheskiy_naprav, UR);
        ArrayList<Fackultet> facultets_uim=new ArrayList<>();
        facultets_uim.add(uim1); facultets_uim.add(uim2);
        Link link_uim1 = new Link(1, R.string.name_link_off, R.string.off_uim);
        Link link_uim2 = new Link(2 , R.string.name_link_vk, R.string.vk_uim);
        Map map_link1 = new Map(1 , R.string.geo, R.string.geo_uim);
        ArrayList<Map> map_links = new ArrayList<>();
        map_links.add(map_link1);
        ArrayList<Link> links_uim = new ArrayList<>();
        links_uim.add(link_uim1); links_uim.add(link_uim2);
        Univer uim =new Univer(1, R.string.Uzhniy_university_managment, R.drawable.uzniy_universitet, R.string.Uzhniy_university_managment_info, R.drawable.uim, R.string.Uzhniy_university_managment_details, facultets_uim, links_uim, map_links);
        allUnivers[0] = uim;

        Fackultet kub_univer_facultet1=new Fackultet(3, R.string.Kub_univer_info_fak_technika_and_technology, R.string.Kub_univer_info_fak_technika_and_technology_naprav, TECH);
        Fackultet kub_univer_facultet2=new Fackultet(4, R.string.Kub_univer_info_fak_Upravlenie, R.string.Kub_univer_info_fak_Upravlenie_naprav, UPRAV);
        Fackultet kub_univer_facultet3=new Fackultet(5, R.string.Kub_univer_info_fak_Information, R.string.Kub_univer_info_fak_Information_naprav, INFOR);
        Fackultet kub_univer_facultet4=new Fackultet(6, R.string.Kub_univer_info_fak_Med_zdorov, R.string.Kub_univer_info_fak_Med_zdorov_naprav, MEDZDRAV);
        Fackultet kub_univer_facultet5=new Fackultet(7, R.string.Kub_univer_info_fak_Toch_tech, R.string.Kub_univer_info_fak_Toch_tech_naprav, TOCH);
        Fackultet kub_univer_facultet6=new Fackultet(8, R.string.Kub_univer_info_fak_Gum, R.string.Kub_univer_info_fak_Gum_naprav, GUM);
        ArrayList<Fackultet> kub_univer_facultets=new ArrayList<>();
        kub_univer_facultets.add(kub_univer_facultet1); kub_univer_facultets.add(kub_univer_facultet2);kub_univer_facultets.add(kub_univer_facultet3);kub_univer_facultets.add(kub_univer_facultet4);kub_univer_facultets.add(kub_univer_facultet5);kub_univer_facultets.add(kub_univer_facultet6);
        Link kub_univer_link1 = new Link(1, R.string.name_link_off, R.string.off_kub_univer);
        Link kub_univer_link2 = new Link(2 , R.string.name_link_vk, R.string.vk_kub_univer);
        Link kub_univer_link3 = new Link(3 , R.string.wiki, R.string.wiki_kub_univer);
        ArrayList<Link> kub_univer_links = new ArrayList<>();
        Map kub_univer_map_link1 = new Map(1 , R.string.geo, R.string.geo_kub_univer);
        ArrayList<Map> kub_univer_map_links = new ArrayList<>();
        kub_univer_map_links.add(kub_univer_map_link1);
        kub_univer_links.add(kub_univer_link1); kub_univer_links.add(kub_univer_link2); kub_univer_links.add(kub_univer_link3);
        Univer kub_univer = new Univer(2, R.string.Kub_univer, R.drawable.kubanskiy_agrarniy, R.string.Kub_univer_info, R.drawable.agrar, R.string.Kub_univer_info_details, kub_univer_facultets, kub_univer_links,kub_univer_map_links);
        allUnivers[1] = kub_univer;

        Fackultet kub_univer_tech_facultet1=new Fackultet(9, R.string.kub_univer_tech_info_fak_tech, R.string.kub_univer_tech_info_fak_tech_naprav, TECH);
        Fackultet kub_univer_tech_facultet2=new Fackultet(10, R.string.kub_univer_tech_info_fak_inform_tech, R.string.kub_univer_tech_info_fak_inform_tech_naprav, INFOR);
        Fackultet kub_univer_tech_facultet3=new Fackultet(11, R.string.kub_univer_tech_info_fak_upravlenie_econom, R.string.kub_univer_tech_info_fak_upravlenie_econom_naprav, UPRAV);
        Fackultet kub_univer_tech_facultet4=new Fackultet(12, R.string.kub_univer_tech_info_fak_tochniy, R.string.kub_univer_tech_info_fak_tochniy_naprav, TOCH);
        Fackultet kub_univer_tech_facultet5=new Fackultet(13, R.string.kub_univer_tech_info_fak_gumanit, R.string.kub_univer_tech_info_fak_gumanit_naprav, GUM);
        Fackultet kub_univer_tech_facultet6=new Fackultet(14, R.string.kub_univer_tech_info_fak_upravlenie, R.string.kub_univer_tech_info_fak_upravlenie_naprav, UPRAV);
        Fackultet kub_univer_tech_facultet7=new Fackultet(15, R.string.kub_univer_tech_info_fak_econom_finance, R.string.kub_univer_tech_info_fak_econom_finance_naprav, UPRAV);
        Fackultet kub_univer_tech_facultet8=new Fackultet(16, R.string.kub_univer_tech_info_fak_bezopasnost, R.string.kub_univer_tech_info_fak_bezopasnost_naprav, BEZ);
        ArrayList<Fackultet> kub_univer_tech_facultets=new ArrayList<>();
        kub_univer_tech_facultets.add(kub_univer_tech_facultet1); kub_univer_tech_facultets.add(kub_univer_tech_facultet2);
        kub_univer_tech_facultets.add(kub_univer_tech_facultet3);kub_univer_tech_facultets.add(kub_univer_tech_facultet4);
        kub_univer_tech_facultets.add(kub_univer_tech_facultet5);kub_univer_tech_facultets.add(kub_univer_tech_facultet6);
        kub_univer_tech_facultets.add(kub_univer_tech_facultet7);kub_univer_tech_facultets.add(kub_univer_tech_facultet8);
        Link kub_univer_tech_link1 = new Link(1, R.string.name_link_off, R.string.off_kub_univer_tech);
        Link kub_univer_tech_link2 = new Link(2 , R.string.name_link_vk, R.string.vk_kub_univer_tech);
        Link kub_univer_tech_link3 = new Link(3 , R.string.wiki, R.string.wiki_kub_univer_tech);
        ArrayList<Link> kub_univer_tech_links = new ArrayList<>();
        Map kub_univer_tech_map_link1 = new Map(1 , R.string.geo, R.string.geo_kub_univer_tech);
        ArrayList<Map> kub_univer_tech_map_links = new ArrayList<>();
        kub_univer_tech_map_links.add(kub_univer_tech_map_link1);
        kub_univer_tech_links.add(kub_univer_tech_link1); kub_univer_tech_links.add(kub_univer_tech_link2); kub_univer_tech_links.add(kub_univer_tech_link3);
        Univer kub_univer_tech = new Univer(3, R.string.kub_univer_tech, R.drawable.kubanskiy_gos_univer, R.string.kub_univer_tech_info, R.drawable.tech, R.string.kub_univer_tech_info_details, kub_univer_tech_facultets, kub_univer_tech_links, kub_univer_tech_map_links);
        allUnivers[2] = kub_univer_tech;

        Fackultet krasnodar_gos_universitet_facultet1=new Fackultet(17, R.string.krasnodar_gos_universitet_info_fak_iscustvo, R.string.krasnodar_gos_universitet_info_fak_iscustvo_naprav, ISSC);
        Fackultet krasnodar_gos_universitet_facultet2=new Fackultet(18, R.string.krasnodar_gos_universitet_info_fak_gum_soc, R.string.krasnodar_gos_universitet_info_fak_gum_soc_naprav, GUM);
        Fackultet krasnodar_gos_universitet_facultet3=new Fackultet(19, R.string.krasnodar_gos_universitet_info_fak_media, R.string.krasnodar_gos_universitet_info_fak_media_naprav, MEDIA);
        Fackultet krasnodar_gos_universitet_facultet4=new Fackultet(20, R.string.krasnodar_gos_universitet_info_fak_tech, R.string.krasnodar_gos_universitet_info_fak_tech_naprav, TECH);
        Fackultet krasnodar_gos_universitet_facultet5=new Fackultet(21, R.string.krasnodar_gos_universitet_info_fak_music, R.string.krasnodar_gos_universitet_info_fak_music_naprav, DIS);
        Fackultet krasnodar_gos_universitet_facultet6=new Fackultet(22, R.string.krasnodar_gos_universitet_info_fak_uprav, R.string.krasnodar_gos_universitet_info_fak_uprav_naprav, UPRAV);
    ArrayList<Fackultet> krasnodar_gos_universitet_facultets=new ArrayList<>();
        krasnodar_gos_universitet_facultets.add(krasnodar_gos_universitet_facultet1); krasnodar_gos_universitet_facultets.add(krasnodar_gos_universitet_facultet2);
        krasnodar_gos_universitet_facultets.add(krasnodar_gos_universitet_facultet3);krasnodar_gos_universitet_facultets.add(krasnodar_gos_universitet_facultet4);
        krasnodar_gos_universitet_facultets.add(krasnodar_gos_universitet_facultet5);krasnodar_gos_universitet_facultets.add(krasnodar_gos_universitet_facultet6);
        Link krasnodar_gos_universitet_link1 = new Link(1, R.string.name_link_off, R.string.off_krasnodar_gos_universitet);
        Link krasnodar_gos_universitet_link2 = new Link(2 , R.string.name_link_vk, R.string.vk_krasnodar_gos_universitet);
        Link krasnodar_gos_universitet_link3 = new Link(3 , R.string.wiki, R.string.wiki_krasnodar_gos_universitet);
        ArrayList<Link> krasnodar_gos_universitet_links = new ArrayList<>();
        Map krasnodar_gos_map_link1 = new Map(1 , R.string.geo, R.string.off_krasnodar_gos_universitet);
        ArrayList<Map> krasnodar_gos_map_links = new ArrayList<>();
        krasnodar_gos_map_links.add(krasnodar_gos_map_link1);
        krasnodar_gos_universitet_links.add(krasnodar_gos_universitet_link1); krasnodar_gos_universitet_links.add(krasnodar_gos_universitet_link2); krasnodar_gos_universitet_links.add(krasnodar_gos_universitet_link3);
        Univer krasnodar_gos_universitet = new Univer(4, R.string.krasnodar_gos_universitet, R.drawable.kultura, R.string.krasnodar_gos_universitet_info, R.drawable.univer_kult, R.string.krasnodar_gos_universitet_info_details, krasnodar_gos_universitet_facultets, krasnodar_gos_universitet_links, krasnodar_gos_map_links);
        allUnivers[3] = krasnodar_gos_universitet;


        Fackultet academiya_marketinga_facultet1=new Fackultet(23, R.string.academiya_marketinga_info_fak_upravlenie, R.string.academiya_marketinga_info_fak_upravlenie_naprav, UPRAV);
        Fackultet academiya_marketinga_facultet2=new Fackultet(24, R.string.academiya_marketinga_info_fak_inform_tech, R.string.academiya_marketinga_info_fak_inform_tech_naprav, INFOR);
        Fackultet academiya_marketinga_facultet3=new Fackultet(25, R.string.academiya_marketinga_info_fak_inform_media, R.string.academiya_marketinga_info_fak_inform_media_naprav, MEDIA);
        Fackultet academiya_marketinga_facultet4=new Fackultet(26, R.string.academiya_marketinga_info_fak_inform_sphera_uslug, R.string.academiya_marketinga_info_fak_inform_sphera_uslug_naprav, SPHERA);
        ArrayList<Fackultet> academiya_marketinga_facultets=new ArrayList<>();
        academiya_marketinga_facultets.add(academiya_marketinga_facultet1); academiya_marketinga_facultets.add(academiya_marketinga_facultet2);
        academiya_marketinga_facultets.add(academiya_marketinga_facultet3);academiya_marketinga_facultets.add(academiya_marketinga_facultet4);
        Link academiya_marketinga_link1 = new Link(1, R.string.name_link_off, R.string.off_academiya_marketinga);
        Link academiya_marketinga_link2 = new Link(2 , R.string.name_link_vk, R.string.vk_academiya_marketinga);
        ArrayList<Link> academiya_marketinga_link = new ArrayList<>();
        Map academiya_marketinga_map_link1 = new Map(1 , R.string.geo, R.string.geo_academiya_marketinga);
        ArrayList<Map> academiya_marketinga_map_links = new ArrayList<>();
        academiya_marketinga_map_links.add(academiya_marketinga_map_link1);
        academiya_marketinga_link.add(academiya_marketinga_link1); academiya_marketinga_link.add(academiya_marketinga_link2);
        Univer academiya_marketinga = new Univer(5, R.string.academiya_marketinga, R.drawable.academia_marketinga, R.string.academiya_marketinga_info, R.drawable.market, R.string.academiya_marketinga_info_details, academiya_marketinga_facultets, academiya_marketinga_link, academiya_marketinga_map_links);
        allUnivers[4] = academiya_marketinga;

        Fackultet finance_univer_facultet1=new Fackultet(27, R.string.finance_univer_info_fak_inform_econom, R.string.finance_univer_info_fak_inform_econom_naprav, UPRAV);
        Fackultet finance_univer_facultet2=new Fackultet(28, R.string.finance_univer_info_fak_inform_managment, R.string.finance_univer_info_fak_inform_managment_naprav, MEN);
        Fackultet finance_univer_facultet3=new Fackultet(29, R.string.finance_univer_info_fak_inform_buisnes_infor, R.string.finance_univer_info_fak_inform_buisnes_infor_naprav, BISINFOR);
        ArrayList<Fackultet> finance_univer_facultets=new ArrayList<>();
        finance_univer_facultets.add(finance_univer_facultet1); finance_univer_facultets.add(finance_univer_facultet2);
        finance_univer_facultets.add(finance_univer_facultet3);
        Link finance_univer_link1 = new Link(1, R.string.name_link_off, R.string.off_finance_univer);
        Link finance_univer_link2 = new Link(2 , R.string.name_link_vk, R.string.vk_finance_univer);
        Map finance_univer_map_link1 = new Map(1 , R.string.geo, R.string.geo_finance_univer);
        ArrayList<Map> finance_univer_map_links = new ArrayList<>();
        finance_univer_map_links.add(finance_univer_map_link1);
        ArrayList<Link> finance_univer_link = new ArrayList<>();
        finance_univer_link.add(finance_univer_link1); finance_univer_link.add(finance_univer_link2);
        Univer finance_univer = new Univer(6, R.string.finance_univer, R.drawable.finance, R.string.finance_univer_info, R.drawable.finance_bild, R.string.finance_univer_info_details, finance_univer_facultets, finance_univer_link, finance_univer_map_links);
        allUnivers[5] = finance_univer;

        Fackultet kub_gos_med_univer_facultet1=new Fackultet(30, R.string.kub_gos_med_univer_info_fak_stomot, R.string.kub_gos_med_univer_info_fak_stomot_naprav, MED);
        Fackultet kub_gos_med_univer_facultet2=new Fackultet(31, R.string.kub_gos_med_univer_info_fak_lechebnoe_delo, R.string.kub_gos_med_univer_info_fak_lechebnoe_delo_naprav, MED);
        Fackultet kub_gos_med_univer_facultet3=new Fackultet(32, R.string.kub_gos_med_univer_info_fak_pediatria, R.string.kub_gos_med_univer_info_fak_pediatria_naprav, MED);
        Fackultet kub_gos_med_univer_facultet4=new Fackultet(33, R.string.kub_gos_med_univer_info_fak_mediko, R.string.kub_gos_med_univer_info_fak_mediko_naprav, MED);
        Fackultet kub_gos_med_univer_facultet5=new Fackultet(34, R.string.kub_gos_med_univer_info_fak_farmaz, R.string.kub_gos_med_univer_info_fak_farmaz_naprav, MED);
        ArrayList<Fackultet> kub_gos_med_univer_facultets=new ArrayList<>();
        kub_gos_med_univer_facultets.add(kub_gos_med_univer_facultet1); kub_gos_med_univer_facultets.add(kub_gos_med_univer_facultet2);
        kub_gos_med_univer_facultets.add(kub_gos_med_univer_facultet3);kub_gos_med_univer_facultets.add(kub_gos_med_univer_facultet4);
        kub_gos_med_univer_facultets.add(kub_gos_med_univer_facultet5);
        Link kub_gos_med_univer_link1 = new Link(1, R.string.name_link_off, R.string.off_kub_gos_med_univer);
        Link kub_gos_med_univer_link2 = new Link(2 , R.string.name_link_vk, R.string.vk_kub_gos_med_univer);
        Link kub_gos_med_univer_link3 = new Link(3 , R.string.wiki, R.string.wiki_kub_gos_med_univer);
        ArrayList<Link> kub_gos_med_univer_link = new ArrayList<>();
        Map kub_gos_med_map_link1 = new Map(1 , R.string.geo, R.string.geo_kub_gos_med_univer);
        ArrayList<Map> kub_gos_med_map_links = new ArrayList<>();
        kub_gos_med_map_links.add(kub_gos_med_map_link1);
        kub_gos_med_univer_link.add(kub_gos_med_univer_link1); kub_gos_med_univer_link.add(kub_gos_med_univer_link2);kub_gos_med_univer_link.add(kub_gos_med_univer_link3);
        Univer kub_gos_med_univer = new Univer(7, R.string.kub_gos_med_univer, R.drawable.kubanskiy_med, R.string.kub_gos_med_univer_info, R.drawable.med, R.string.kub_gos_med_univer_info_details, kub_gos_med_univer_facultets, kub_gos_med_univer_link, kub_gos_med_map_links);
        allUnivers[6] = kub_gos_med_univer;

        Fackultet kub_gos_univer_fizika_facultet1=new Fackultet(35, R.string.kub_gos_univer_fizika_info_fak_gum_soc, R.string.kub_gos_univer_fizika_info_fak_gum_soc_naprav, GUM);
        Fackultet kub_gos_univer_fizika_facultet2=new Fackultet(36, R.string.kub_gos_univer_fizika_info_fak_uprav, R.string.kub_gos_univer_fizika_info_fak_uprav_naprav, UPRAV);
        ArrayList<Fackultet> kub_gos_univer_fizika_facultets=new ArrayList<>();
        kub_gos_univer_fizika_facultets.add(kub_gos_univer_fizika_facultet1); kub_gos_univer_fizika_facultets.add(kub_gos_univer_fizika_facultet2);
        Link kub_gos_univer_fizika_link1 = new Link(1, R.string.name_link_off, R.string.off_kub_gos_univer_fizika);
        Link kub_gos_univer_fizika_link2 = new Link(2 , R.string.name_link_vk, R.string.vk_kub_gos_univer_fizika);
        ArrayList<Link> kub_gos_univer_fizika_link = new ArrayList<>();
        Map kub_gos_univer_fizika_map_link1 = new Map(1 , R.string.geo, R.string.geo_kub_gos_univer_fizika);
        ArrayList<Map> kub_gos_univer_fizika_map_links = new ArrayList<>();
        kub_gos_univer_fizika_map_links.add(kub_gos_univer_fizika_map_link1);
        kub_gos_univer_fizika_link.add(kub_gos_univer_fizika_link1); kub_gos_univer_fizika_link.add(kub_gos_univer_fizika_link2);
        Univer kub_gos_univer_fizika = new Univer(8, R.string.kub_gos_univer_fizika, R.drawable.kubanskiy_univer_fizkultura, R.string.kub_gos_univer_fizika_info, R.drawable.sport, R.string.kub_gos_univer_fizika_info_details, kub_gos_univer_fizika_facultets, kub_gos_univer_fizika_link, kub_gos_univer_fizika_map_links);
        allUnivers[7] = kub_gos_univer_fizika;

        Fackultet rf_econom_facultet1=new Fackultet(37, R.string.rf_econom_info_fak_upravlenie, R.string.rf_econom_info_fak_upravlenie_naprav, UPRAV);
        Fackultet rf_econom_facultet2=new Fackultet(38, R.string.rf_econom_info_fak_technika, R.string.rf_econom_info_fak_technika_naprav, TECH);
        Fackultet rf_econom_facultet3=new Fackultet(39, R.string.rf_econom_info_fak_econom, R.string.rf_econom_info_fak_econom_naprav, UPRAV);
        ArrayList<Fackultet> rf_econom_facultets=new ArrayList<>();
        rf_econom_facultets.add(rf_econom_facultet1); rf_econom_facultets.add(rf_econom_facultet2);
        rf_econom_facultets.add(rf_econom_facultet3);
        Link rf_econom_link1 = new Link(1, R.string.name_link_off, R.string.off_rf_econom);
        Link rf_econom_link2 = new Link(2 , R.string.name_link_vk, R.string.vk_rf_econom);
        Link rf_econom_link3 = new Link(3 , R.string.wiki, R.string.wiki_rf_econom);
        ArrayList<Link> rf_econom_link = new ArrayList<>();
        Map rf_econom_map_link1 = new Map(1 , R.string.geo, R.string.geo_rf_econom);
        ArrayList<Map> rf_econom_map_links = new ArrayList<>();
        rf_econom_map_links.add(rf_econom_map_link1);
        rf_econom_link.add(rf_econom_link1); rf_econom_link.add(rf_econom_link2);rf_econom_link.add(rf_econom_link3);
        Univer rf_econom = new Univer(9, R.string.rf_econom, R.drawable.plehanov, R.string.rf_econom_info, R.drawable.pleh, R.string.rf_econom_info_details, rf_econom_facultets, rf_econom_link, rf_econom_map_links);
        allUnivers[8] = rf_econom;

        Fackultet krasnodar_mvd_facultet1=new Fackultet(40, R.string.krasnodar_mvd_info_fak_gum, R.string.krasnodar_mvd_info_fak_gum_naprav, MVD);
        Fackultet krasnodar_mvd_facultet2=new Fackultet(41, R.string.krasnodar_mvd_info_fak_inform, R.string.krasnodar_mvd_info_fak_inform_naprav, MVD);
        Fackultet krasnodar_mvd_facultet3=new Fackultet(42, R.string.krasnodar_mvd_info_fak_uprav, R.string.krasnodar_mvd_info_fak_uprav_naprav, MVD);
        ArrayList<Fackultet> krasnodar_mvd_facultets=new ArrayList<>();
        krasnodar_mvd_facultets.add(krasnodar_mvd_facultet1); krasnodar_mvd_facultets.add(krasnodar_mvd_facultet2);
        krasnodar_mvd_facultets.add(krasnodar_mvd_facultet3);
        Link krasnodar_mvd_link1 = new Link(1, R.string.name_link_off, R.string.off_krasnodar_mvd);
        Link krasnodar_mvd_link2 = new Link(2 , R.string.name_link_vk, R.string.vk_krasnodar_mvd);
        Link krasnodar_mvd_link3 = new Link(3 , R.string.wiki, R.string.wiki_krasnodar_mvd);
        ArrayList<Link> krasnodar_mvd_link = new ArrayList<>();
        Map krasnodar_mvd_map_link1 = new Map(1 , R.string.geo, R.string.geo_krasnodar_mvd);
        ArrayList<Map> krasnodar_mvd_links = new ArrayList<>();
        krasnodar_mvd_links.add(krasnodar_mvd_map_link1);
        krasnodar_mvd_link.add(krasnodar_mvd_link1); krasnodar_mvd_link.add(krasnodar_mvd_link2);krasnodar_mvd_link.add(krasnodar_mvd_link3);
        Univer krasnodar_mvd = new Univer(10, R.string.krasnodar_mvd, R.drawable.zakon, R.string.krasnodar_mvd_info, R.drawable.mvd, R.string.krasnodar_mvd_info_details, krasnodar_mvd_facultets, krasnodar_mvd_link, krasnodar_mvd_links);
        allUnivers[9] = krasnodar_mvd;



        Fackultet kub_gos_univer_facultet1=new Fackultet(43, R.string.kub_gos_univer_info_fak_gum, R.string.kub_gos_univer_info_fak_gum_naprav, GUM);
        Fackultet kub_gos_univer_facultet2=new Fackultet(44, R.string.kub_gos_univer_info_fak_tochniy, R.string.kub_gos_univer_info_fak_tochniy_naprav, TOCH);
        Fackultet kub_gos_univer_facultet3=new Fackultet(45, R.string.kub_gos_univer_info_fak_uprav, R.string.kub_gos_univer_info_fak_uprav_naprav, UPRAV);
        Fackultet kub_gos_univer_facultet4=new Fackultet(46, R.string.kub_gos_univer_info_fak_tech, R.string.kub_gos_univer_info_fak_tech_naprav, TECH);
        Fackultet kub_gos_univer_facultet5=new Fackultet(47, R.string.kub_gos_univer_info_fak_inform_tech, R.string.kub_gos_univer_info_fak_inform_tech_naprav, INFOR);
        Fackultet kub_gos_univer_facultet6=new Fackultet(48, R.string.kub_gos_univer_info_fak_media, R.string.kub_gos_univer_info_fak_media_naprav, MEDIA);
        Fackultet kub_gos_univer_facultet7=new Fackultet(49, R.string.kub_gos_univer_info_fak_sphera_uslug, R.string.kub_gos_univer_info_fak_sphera_uslug_naprav, SPHERA);
        ArrayList<Fackultet> kub_gos_univer_facultets=new ArrayList<>();
        kub_gos_univer_facultets.add(kub_gos_univer_facultet1); kub_gos_univer_facultets.add(kub_gos_univer_facultet2);
        kub_gos_univer_facultets.add(kub_gos_univer_facultet3);kub_gos_univer_facultets.add(kub_gos_univer_facultet4);
        kub_gos_univer_facultets.add(kub_gos_univer_facultet5);kub_gos_univer_facultets.add(kub_gos_univer_facultet6);
        kub_gos_univer_facultets.add(kub_gos_univer_facultet7);
        Link kub_gos_univer_link1 = new Link(1, R.string.name_link_off, R.string.off_kub_gos_univer);
        Link kub_gos_univer_link2 = new Link(2 , R.string.name_link_vk, R.string.vk_kub_gos_univer);
        Link kub_gos_univer_link3 = new Link(3 , R.string.wiki, R.string.wiki_kub_gos_univer);
        ArrayList<Link> kub_gos_univer_link = new ArrayList<>();
        Map kub_gos_univer_map_link1 = new Map(1 , R.string.geo, R.string.geo_kub_gos_univer);
        ArrayList<Map> kub_gos_univer_map_links = new ArrayList<>();
        kub_gos_univer_map_links.add(kub_gos_univer_map_link1);
        kub_gos_univer_link.add(kub_gos_univer_link1); kub_gos_univer_link.add(kub_gos_univer_link2);kub_gos_univer_link.add(kub_gos_univer_link3);
        Univer kub_gos_univer = new Univer(11, R.string.kub_gos_univer, R.drawable.kusu, R.string.kub_gos_univer_info, R.drawable.kubus, R.string.kub_gos_univer_info_details, kub_gos_univer_facultets, kub_gos_univer_link, kub_gos_univer_map_links);
        allUnivers[10] = kub_gos_univer;
    }


}
