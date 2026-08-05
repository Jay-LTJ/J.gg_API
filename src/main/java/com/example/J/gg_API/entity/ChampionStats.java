package com.example.J.gg_API.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "riftstats")
public class ChampionStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statId;



    @Column(name = "flathp")
    private float flatHP;

    @Column(name = "percenthp")
    private float percentHP;

    @Column(name = "perlevelhp")
    private float perLevelHP;

    @Column(name = "percentlevelhp")
    private float PercentLevelHP;

    @Column(name = "flathpregen")
    private float flatHpRegen;

    @Column(name = "percenthpregen")
    private float percentHpRegen;

    @Column(name = "perlevelhpregen")
    private float perLevelHpRegen;

    @Column(name = "percentlevelhpregen")
    private float PercentLevelHpRegen;

    @Column(name = "flatmana")
    private float flatMana;

    @Column(name = "percentmana")
    private float percentMana;

    @Column(name = "perlevelmana")
    private float perLevelMana;

    @Column(name = "percentlevelmana")
    private float PercentLevelMana;

    @Column(name = "flatmanaregen")
    private float flatManaRegen;

    @Column(name = "percentmanaregen")
    private float percentManaRegen;

    @Column(name = "perlevelmanaregen")
    private float perLevelManaRegen;

    @Column(name = "percentlevelmanaregen")
    private float PercentLevelManaRegen;

    @Column(name = "flatarmour")
    private float flatArmour;

    @Column(name = "percentarmour")
    private float percentArmour;

    @Column(name = "perlevelarmour")
    private float perLevelArmour;

    @Column(name = "percentlevelarmour")
    private float PercentLevelArmour;

    @Column(name = "flatmagicresistance")
    private float flatMagicResistance;

    @Column(name = "percentmagicresistance")
    private float percentMagicResistance;

    @Column(name = "perlevelmagicresistance")
    private float perLevelMagicResistance;

    @Column(name = "percentlevelmagicresistance")
    private float PercentLevelMagicResistance;

    @Column(name = "flatattackdamage")
    private float flatAttackDamage;

    @Column(name = "percentattackdamage")
    private float percentAttackDamage;

    @Column(name = "perlevelattackdamage")
    private float perLevelAttackDamage;

    @Column(name = "percentlevelattackdamage")
    private float PercentLevelAttackDamage;

    @Column(name = "flatmovemenetspeed")
    private float flatMovementSpeed;

    @Column(name = "percentmovemenetspeed")
    private float percentMovementSpeed;

    @Column(name = "perlevelmovemenetspeed")
    private float perLevelMovementSpeed;

    @Column(name = "percentlevelmovemenetspeed")
    private float PercentLevelMovementSpeed;

    @Column(name = "flatcritdamage")
    private float flatCritDamage;

    @Column(name = "percentcritdamage")
    private float percentCritDamage;

    @Column(name = "perlevelcritdamage")
    private float perLevelCritDamage;

    @Column(name = "percentlevelcritdamage")
    private float PercentLevelCritDamage;

    @Column(name = "flatcritdamagemod")
    private float flatCritDamageMod;

    @Column(name = "percentcritdamagemod")
    private float percentCritDamageMod;

    @Column(name = "perlevelcritdamagemod")
    private float perLevelCritDamageMod;

    @Column(name = "percentlevelcritdamagemod")
    private float PercentLevelCritDamageMod;

    @Column(name = "flatattackspeed")
    private float flatAttackSpeed;

    @Column(name = "percentattackspeed")
    private float percentAttackSpeed;

    @Column(name = "perlevelattackspeed")
    private float perLevelAttackSpeed;

    @Column(name = "percentlevelattackspeed")
    private float PercentLevelAttackSpeed;

    @Column(name = "flatattackspeedratio")
    private float flatAttackSpeedRatio;

    @Column(name = "percentattackspeedratio")
    private float percentAttackSpeedRatio;

    @Column(name = "perlevelattackspeedratio")
    private float perLevelAttackSpeedRatio;

    @Column(name = "percentlevelattackspeedratio")
    private float PercentLevelAttackSpeedRatio;

    @Column(name = "flatattackrange")
    private float flatAttackRange;

    @Column(name = "percentattackrange")
    private float percentAttackRange;

    @Column(name = "perlevelattackrange")
    private float perLevelAttackRange;

    @Column(name = "percentlevelattackrange")
    private float PercentLevelAttackRange;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "championId", nullable = false)
    private Champion Champion;

    public ChampionStats() {}

    public ChampionStats(float flatHP, float percentHP, float perLevelHP, float percentLevelHP, float flatHpRegen, float percentHpRegen, float perLevelHpRegen, float percentLevelHpRegen, float flatMana, float percentMana, float perLevelMana, float percentLevelMana, float flatManaRegen, float percentManaRegen, float perLevelManaRegen, float percentLevelManaRegen, float flatArmour, float percentArmour, float perLevelArmour, float percentLevelArmour, float flatMagicResistance, float percentMagicResistance, float perLevelMagicResistance, float percentLevelMagicResistance, float flatAttackDamage, float percentAttackDamage, float perLevelAttackDamage, float percentLevelAttackDamage, float flatMovementSpeed, float percentMovementSpeed, float perLevelMovementSpeed, float percentLevelMovementSpeed, float flatCritDamage, float percentCritDamage, float perLevelCritDamage, float percentLevelCritDamage, float flatCritDamageMod, float percentCritDamageMod, float perLevelCritDamageMod, float percentLevelCritDamageMod, float flatAttackSpeed, float percentAttackSpeed, float perLevelAttackSpeed, float percentLevelAttackSpeed, float flatAttackSpeedRatio, float percentAttackSpeedRatio, float perLevelAttackSpeedRatio, float percentLevelAttackSpeedRatio, float flatAttackRange, float percentAttackRange, float perLevelAttackRange, float percentLevelAttackRange, Champion champion) {

        this.flatHP = flatHP;
        this.percentHP = percentHP;
        this.perLevelHP = perLevelHP;
        PercentLevelHP = percentLevelHP;
        this.flatHpRegen = flatHpRegen;
        this.percentHpRegen = percentHpRegen;
        this.perLevelHpRegen = perLevelHpRegen;
        PercentLevelHpRegen = percentLevelHpRegen;
        this.flatMana = flatMana;
        this.percentMana = percentMana;
        this.perLevelMana = perLevelMana;
        PercentLevelMana = percentLevelMana;
        this.flatManaRegen = flatManaRegen;
        this.percentManaRegen = percentManaRegen;
        this.perLevelManaRegen = perLevelManaRegen;
        PercentLevelManaRegen = percentLevelManaRegen;
        this.flatArmour = flatArmour;
        this.percentArmour = percentArmour;
        this.perLevelArmour = perLevelArmour;
        PercentLevelArmour = percentLevelArmour;
        this.flatMagicResistance = flatMagicResistance;
        this.percentMagicResistance = percentMagicResistance;
        this.perLevelMagicResistance = perLevelMagicResistance;
        PercentLevelMagicResistance = percentLevelMagicResistance;
        this.flatAttackDamage = flatAttackDamage;
        this.percentAttackDamage = percentAttackDamage;
        this.perLevelAttackDamage = perLevelAttackDamage;
        PercentLevelAttackDamage = percentLevelAttackDamage;
        this.flatMovementSpeed = flatMovementSpeed;
        this.percentMovementSpeed = percentMovementSpeed;
        this.perLevelMovementSpeed = perLevelMovementSpeed;
        PercentLevelMovementSpeed = percentLevelMovementSpeed;
        this.flatCritDamage = flatCritDamage;
        this.percentCritDamage = percentCritDamage;
        this.perLevelCritDamage = perLevelCritDamage;
        PercentLevelCritDamage = percentLevelCritDamage;
        this.flatCritDamageMod = flatCritDamageMod;
        this.percentCritDamageMod = percentCritDamageMod;
        this.perLevelCritDamageMod = perLevelCritDamageMod;
        PercentLevelCritDamageMod = percentLevelCritDamageMod;
        this.flatAttackSpeed = flatAttackSpeed;
        this.percentAttackSpeed = percentAttackSpeed;
        this.perLevelAttackSpeed = perLevelAttackSpeed;
        PercentLevelAttackSpeed = percentLevelAttackSpeed;
        this.flatAttackSpeedRatio = flatAttackSpeedRatio;
        this.percentAttackSpeedRatio = percentAttackSpeedRatio;
        this.perLevelAttackSpeedRatio = perLevelAttackSpeedRatio;
        PercentLevelAttackSpeedRatio = percentLevelAttackSpeedRatio;
        this.flatAttackRange = flatAttackRange;
        this.percentAttackRange = percentAttackRange;
        this.perLevelAttackRange = perLevelAttackRange;
        PercentLevelAttackRange = percentLevelAttackRange;
        this.Champion = champion;
    }

    public Champion getChampion() {
        return Champion;
    }

    public void setChampion(Champion champion) {
        Champion = champion;
    }

    public int getStatId() {
        return statId;
    }

    public void setStatId(int statId) {
        this.statId = statId;
    }





    public float getFlatHP() {
        return flatHP;
    }

    public void setFlatHP(float flatHP) {
        this.flatHP = flatHP;
    }

    public float getPerLevelHP() {
        return perLevelHP;
    }

    public void setPerLevelHP(float perLevelHP) {
        this.perLevelHP = perLevelHP;
    }

    public float getPercentHP() {
        return percentHP;
    }

    public void setPercentHP(float percentHP) {
        this.percentHP = percentHP;
    }

    public float getPercentLevelHP() {
        return PercentLevelHP;
    }

    public void setPercentLevelHP(float percentLevelHP) {
        PercentLevelHP = percentLevelHP;
    }

    public float getFlatHpRegen() {
        return flatHpRegen;
    }

    public void setFlatHpRegen(float flatHpRegen) {
        this.flatHpRegen = flatHpRegen;
    }

    public float getPercentHpRegen() {
        return percentHpRegen;
    }

    public void setPercentHpRegen(float percentHpRegen) {
        this.percentHpRegen = percentHpRegen;
    }

    public float getPerLevelHpRegen() {
        return perLevelHpRegen;
    }

    public void setPerLevelHpRegen(float perLevelHpRegen) {
        this.perLevelHpRegen = perLevelHpRegen;
    }

    public float getFlatMana() {
        return flatMana;
    }

    public void setFlatMana(float flatMana) {
        this.flatMana = flatMana;
    }

    public float getPercentLevelHpRegen() {
        return PercentLevelHpRegen;
    }

    public void setPercentLevelHpRegen(float percentLevelHpRegen) {
        PercentLevelHpRegen = percentLevelHpRegen;
    }

    public float getPercentMana() {
        return percentMana;
    }

    public void setPercentMana(float percentMana) {
        this.percentMana = percentMana;
    }

    public float getPerLevelMana() {
        return perLevelMana;
    }

    public void setPerLevelMana(float perLevelMana) {
        this.perLevelMana = perLevelMana;
    }

    public float getPercentLevelMana() {
        return PercentLevelMana;
    }

    public void setPercentLevelMana(float percentLevelMana) {
        PercentLevelMana = percentLevelMana;
    }

    public float getFlatManaRegen() {
        return flatManaRegen;
    }

    public void setFlatManaRegen(float flatManaRegen) {
        this.flatManaRegen = flatManaRegen;
    }

    public float getPercentManaRegen() {
        return percentManaRegen;
    }

    public void setPercentManaRegen(float percentManaRegen) {
        this.percentManaRegen = percentManaRegen;
    }

    public float getPerLevelManaRegen() {
        return perLevelManaRegen;
    }

    public void setPerLevelManaRegen(float perLevelManaRegen) {
        this.perLevelManaRegen = perLevelManaRegen;
    }

    public float getPercentLevelManaRegen() {
        return PercentLevelManaRegen;
    }

    public void setPercentLevelManaRegen(float percentLevelManaRegen) {
        PercentLevelManaRegen = percentLevelManaRegen;
    }

    public float getFlatArmour() {
        return flatArmour;
    }

    public void setFlatArmour(float flatArmour) {
        this.flatArmour = flatArmour;
    }

    public float getPercentArmour() {
        return percentArmour;
    }

    public void setPercentArmour(float percentArmour) {
        this.percentArmour = percentArmour;
    }

    public float getPerLevelArmour() {
        return perLevelArmour;
    }

    public void setPerLevelArmour(float perLevelArmour) {
        this.perLevelArmour = perLevelArmour;
    }

    public float getPercentLevelArmour() {
        return PercentLevelArmour;
    }

    public void setPercentLevelArmour(float percentLevelArmour) {
        PercentLevelArmour = percentLevelArmour;
    }

    public float getFlatMagicResistance() {
        return flatMagicResistance;
    }

    public void setFlatMagicResistance(float flatMagicResistance) {
        this.flatMagicResistance = flatMagicResistance;
    }

    public float getPercentMagicResistance() {
        return percentMagicResistance;
    }

    public void setPercentMagicResistance(float percentMagicResistance) {
        this.percentMagicResistance = percentMagicResistance;
    }

    public float getPerLevelMagicResistance() {
        return perLevelMagicResistance;
    }

    public void setPerLevelMagicResistance(float perLevelMagicResistance) {
        this.perLevelMagicResistance = perLevelMagicResistance;
    }

    public float getPercentLevelMagicResistance() {
        return PercentLevelMagicResistance;
    }

    public void setPercentLevelMagicResistance(float percentLevelMagicResistance) {
        PercentLevelMagicResistance = percentLevelMagicResistance;
    }

    public float getFlatAttackDamage() {
        return flatAttackDamage;
    }

    public void setFlatAttackDamage(float flatAttackDamage) {
        this.flatAttackDamage = flatAttackDamage;
    }

    public float getPercentAttackDamage() {
        return percentAttackDamage;
    }

    public void setPercentAttackDamage(float percentAttackDamage) {
        this.percentAttackDamage = percentAttackDamage;
    }

    public float getPerLevelAttackDamage() {
        return perLevelAttackDamage;
    }

    public void setPerLevelAttackDamage(float perLevelAttackDamage) {
        this.perLevelAttackDamage = perLevelAttackDamage;
    }

    public float getPercentLevelAttackDamage() {
        return PercentLevelAttackDamage;
    }

    public void setPercentLevelAttackDamage(float percentLevelAttackDamage) {
        PercentLevelAttackDamage = percentLevelAttackDamage;
    }

    public float getFlatMovementSpeed() {
        return flatMovementSpeed;
    }

    public void setFlatMovementSpeed(float flatMovementSpeed) {
        this.flatMovementSpeed = flatMovementSpeed;
    }

    public float getPercentMovementSpeed() {
        return percentMovementSpeed;
    }

    public void setPercentMovementSpeed(float percentMovementSpeed) {
        this.percentMovementSpeed = percentMovementSpeed;
    }

    public float getPerLevelMovementSpeed() {
        return perLevelMovementSpeed;
    }

    public void setPerLevelMovementSpeed(float perLevelMovementSpeed) {
        this.perLevelMovementSpeed = perLevelMovementSpeed;
    }

    public float getPercentLevelMovementSpeed() {
        return PercentLevelMovementSpeed;
    }

    public void setPercentLevelMovementSpeed(float percentLevelMovementSpeed) {
        PercentLevelMovementSpeed = percentLevelMovementSpeed;
    }

    public float getFlatCritDamage() {
        return flatCritDamage;
    }

    public void setFlatCritDamage(float flatCritDamage) {
        this.flatCritDamage = flatCritDamage;
    }

    public float getPercentCritDamage() {
        return percentCritDamage;
    }

    public void setPercentCritDamage(float percentCritDamage) {
        this.percentCritDamage = percentCritDamage;
    }

    public float getPerLevelCritDamage() {
        return perLevelCritDamage;
    }

    public void setPerLevelCritDamage(float perLevelCritDamage) {
        this.perLevelCritDamage = perLevelCritDamage;
    }

    public float getPercentLevelCritDamage() {
        return PercentLevelCritDamage;
    }

    public void setPercentLevelCritDamage(float percentLevelCritDamage) {
        PercentLevelCritDamage = percentLevelCritDamage;
    }

    public float getFlatCritDamageMod() {
        return flatCritDamageMod;
    }

    public void setFlatCritDamageMod(float flatCritDamageMod) {
        this.flatCritDamageMod = flatCritDamageMod;
    }

    public float getPercentCritDamageMod() {
        return percentCritDamageMod;
    }

    public void setPercentCritDamageMod(float percentCritDamageMod) {
        this.percentCritDamageMod = percentCritDamageMod;
    }

    public float getPerLevelCritDamageMod() {
        return perLevelCritDamageMod;
    }

    public void setPerLevelCritDamageMod(float perLevelCritDamageMod) {
        this.perLevelCritDamageMod = perLevelCritDamageMod;
    }

    public float getPercentLevelCritDamageMod() {
        return PercentLevelCritDamageMod;
    }

    public void setPercentLevelCritDamageMod(float percentLevelCritDamageMod) {
        PercentLevelCritDamageMod = percentLevelCritDamageMod;
    }

    public float getFlatAttackSpeed() {
        return flatAttackSpeed;
    }

    public void setFlatAttackSpeed(float flatAttackSpeed) {
        this.flatAttackSpeed = flatAttackSpeed;
    }

    public float getPercentAttackSpeed() {
        return percentAttackSpeed;
    }

    public void setPercentAttackSpeed(float percentAttackSpeed) {
        this.percentAttackSpeed = percentAttackSpeed;
    }

    public float getPerLevelAttackSpeed() {
        return perLevelAttackSpeed;
    }

    public void setPerLevelAttackSpeed(float perLevelAttackSpeed) {
        this.perLevelAttackSpeed = perLevelAttackSpeed;
    }

    public float getPercentLevelAttackSpeed() {
        return PercentLevelAttackSpeed;
    }

    public void setPercentLevelAttackSpeed(float percentLevelAttackSpeed) {
        PercentLevelAttackSpeed = percentLevelAttackSpeed;
    }

    public float getFlatAttackSpeedRatio() {
        return flatAttackSpeedRatio;
    }

    public void setFlatAttackSpeedRatio(float flatAttackSpeedRatio) {
        this.flatAttackSpeedRatio = flatAttackSpeedRatio;
    }

    public float getPercentAttackSpeedRatio() {
        return percentAttackSpeedRatio;
    }

    public void setPercentAttackSpeedRatio(float percentAttackSpeedRatio) {
        this.percentAttackSpeedRatio = percentAttackSpeedRatio;
    }

    public float getPerLevelAttackSpeedRatio() {
        return perLevelAttackSpeedRatio;
    }

    public void setPerLevelAttackSpeedRatio(float perLevelAttackSpeedRatio) {
        this.perLevelAttackSpeedRatio = perLevelAttackSpeedRatio;
    }

    public float getPercentLevelAttackSpeedRatio() {
        return PercentLevelAttackSpeedRatio;
    }

    public void setPercentLevelAttackSpeedRatio(float percentLevelAttackSpeedRatio) {
        PercentLevelAttackSpeedRatio = percentLevelAttackSpeedRatio;
    }

    public float getFlatAttackRange() {
        return flatAttackRange;
    }

    public void setFlatAttackRange(float flatAttackRange) {
        this.flatAttackRange = flatAttackRange;
    }

    public float getPercentAttackRange() {
        return percentAttackRange;
    }

    public void setPercentAttackRange(float percentAttackRange) {
        this.percentAttackRange = percentAttackRange;
    }

    public float getPerLevelAttackRange() {
        return perLevelAttackRange;
    }

    public void setPerLevelAttackRange(float perLevelAttackRange) {
        this.perLevelAttackRange = perLevelAttackRange;
    }

    public float getPercentLevelAttackRange() {
        return PercentLevelAttackRange;
    }

    public void setPercentLevelAttackRange(float percentLevelAttackRange) {
        PercentLevelAttackRange = percentLevelAttackRange;
    }

    @Override
    public String toString() {
        return "ChampionStats{" +
                ", flatHP=" + flatHP +
                ", percentHP=" + percentHP +
                ", perLevelHP=" + perLevelHP +
                ", PercentLevelHP=" + PercentLevelHP +
                ", flatHpRegen=" + flatHpRegen +
                ", percentHpRegen=" + percentHpRegen +
                ", perLevelHpRegen=" + perLevelHpRegen +
                ", PercentLevelHpRegen=" + PercentLevelHpRegen +
                ", flatMana=" + flatMana +
                ", percentMana=" + percentMana +
                ", perLevelMana=" + perLevelMana +
                ", PercentLevelMana=" + PercentLevelMana +
                ", flatManaRegen=" + flatManaRegen +
                ", percentManaRegen=" + percentManaRegen +
                ", perLevelManaRegen=" + perLevelManaRegen +
                ", PercentLevelManaRegen=" + PercentLevelManaRegen +
                ", flatArmour=" + flatArmour +
                ", percentArmour=" + percentArmour +
                ", perLevelArmour=" + perLevelArmour +
                ", PercentLevelArmour=" + PercentLevelArmour +
                ", flatMagicResistance=" + flatMagicResistance +
                ", percentMagicResistance=" + percentMagicResistance +
                ", perLevelMagicResistance=" + perLevelMagicResistance +
                ", PercentLevelMagicResistance=" + PercentLevelMagicResistance +
                ", flatAttackDamage=" + flatAttackDamage +
                ", percentAttackDamage=" + percentAttackDamage +
                ", perLevelAttackDamage=" + perLevelAttackDamage +
                ", PercentLevelAttackDamage=" + PercentLevelAttackDamage +
                ", flatMovementSpeed=" + flatMovementSpeed +
                ", percentMovementSpeed=" + percentMovementSpeed +
                ", perLevelMovementSpeed=" + perLevelMovementSpeed +
                ", PercentLevelMovementSpeed=" + PercentLevelMovementSpeed +
                ", flatCritDamage=" + flatCritDamage +
                ", percentCritDamage=" + percentCritDamage +
                ", perLevelCritDamage=" + perLevelCritDamage +
                ", PercentLevelCritDamage=" + PercentLevelCritDamage +
                ", flatCritDamageMod=" + flatCritDamageMod +
                ", percentCritDamageMod=" + percentCritDamageMod +
                ", perLevelCritDamageMod=" + perLevelCritDamageMod +
                ", PercentLevelCritDamageMod=" + PercentLevelCritDamageMod +
                ", flatAttackSpeed=" + flatAttackSpeed +
                ", percentAttackSpeed=" + percentAttackSpeed +
                ", perLevelAttackSpeed=" + perLevelAttackSpeed +
                ", PercentLevelAttackSpeed=" + PercentLevelAttackSpeed +
                ", flatAttackSpeedRatio=" + flatAttackSpeedRatio +
                ", percentAttackSpeedRatio=" + percentAttackSpeedRatio +
                ", perLevelAttackSpeedRatio=" + perLevelAttackSpeedRatio +
                ", PercentLevelAttackSpeedRatio=" + PercentLevelAttackSpeedRatio +
                ", flatAttackRange=" + flatAttackRange +
                ", percentAttackRange=" + percentAttackRange +
                ", perLevelAttackRange=" + perLevelAttackRange +
                ", PercentLevelAttackRange=" + PercentLevelAttackRange +
                '}';
    }

}
