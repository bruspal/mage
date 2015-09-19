/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.battleforzendikar;

import java.util.UUID;
import mage.abilities.dynamicvalue.common.ColorsOfManaSpentToCastCount;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.LoseLifeSourceControllerEffect;
import mage.cards.CardImpl;
import mage.constants.AbilityWord;
import mage.constants.CardType;
import mage.constants.Rarity;

/**
 *
 * @author fireshoes
 */
public class PainfulTruths extends CardImpl {

    public PainfulTruths(UUID ownerId) {
        super(ownerId, 120, "Painful Truths", Rarity.RARE, new CardType[]{CardType.SORCERY}, "{2}{B}");
        this.expansionSetCode = "BFZ";

        // <i>Converge</i> - Draw X cards and lose X life, where X is the number of colors of mana spent to cast Painful Truths.
        getSpellAbility().setAbilityWord(AbilityWord.CONVERGE);
        Effect effect = new DrawCardSourceControllerEffect(ColorsOfManaSpentToCastCount.getInstance());
        effect.setText("Draw X cards");
        getSpellAbility().addEffect(effect);
        effect = new LoseLifeSourceControllerEffect(ColorsOfManaSpentToCastCount.getInstance());
        effect.setText("and lose X life, where X is the number of colors of mana spent to cast {this}");
        getSpellAbility().addEffect(effect);
    }

    public PainfulTruths(final PainfulTruths card) {
        super(card);
    }

    @Override
    public PainfulTruths copy() {
        return new PainfulTruths(this);
    }
}