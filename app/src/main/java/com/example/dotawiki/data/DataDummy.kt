package com.example.dotawiki.data

import com.example.dotawiki.model.hero

fun getData(): ArrayList<hero>{
    val heroes = ArrayList<hero>()
    heroes.add(
        hero("Juggernaut",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROoVlLHBieGXCpyRHYYuz8Ft-mpyFFBxwnGA&usqp=CAU",
        "Yurnero, the Juggernaut, is a melee agility hero whose abilities allow him to sprint into battle and recklessly devastate enemies in an impenetrable flurry of blades. His abilities grant invulnerability and spell immunity, turning him into an unstoppable force on a hairpin. Juggernaut is strong both offensively and defensively, and deals heavy damage both physical and magical with his Blade Fury and Omnislash ultimate, but he possesses below average strength and intelligence attributes, so he does not have as much health and mana as other heroes and is vulnerable when his abilities are on cooldown. For this reason, although his abilities make him powerful even in the early game, he cannot charge into forces without restraint until farmed and is usually played as a carry.",
        "https://cdn-images.win.gg/resize/w/800/h/600/format/jpg/type/progressive/fit/cover/path/news/images/4967/ad83c4c05e1b634ae81360615efdcd93/original.jpg")
    )

    heroes.add(
        hero("Troll Warlord",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROoVlLHBieGXCpyRHYYuz8Ft-mpyFFBxwnGA&usqp=CAU",
            "Jah'rakal, the Troll Warlord, is a ranged agility hero able to output mighty damage competitively at range and in melee. His Berserker's Rage gives him the unique ability to change his attack position from ranged to melee and back at will as the situation warrants. When in close combat, his stats are increased accordingly: he gains bonus armor, movement speed, reduced base attack time, and the ability to root. Not only does this greatly improve the Troll Warlord, but allows him to overpower most other carries, as well as permanently ensnare a target for extended amounts of time. ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwBKWi7Omn1gJ9PAnepMLmZtuPCjAXX4pcvA&usqp=CAU"
        )
    )

    heroes.add(
        hero("Legion Commander",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3W0zklStil6nkV4P32RZ2cdYJ9QJRvzLhPQ&usqp=CAU",
        "Tresdin, the Legion Commander, is a melee strength hero fitting the role of carry. A highly mobile and somewhat tanky hero, her skillset and gameplay revolve mainly around killing off targets and especially backliners and supports, with her ultimate, Duel. Each successful Duel grants Tresdin permanent bonus damage. Though she is extremely skilled in \"fair\" one-on-one fights, Tresdin suffers when outnumbered and must choose her engagements carefully. A successful midgame sees her roaming the map, collecting kills and developing into a fearsome carry, so that by lategame she need no longer rely on duel to destroy any enemies that venture too close. Though potentially an extremely powerful hero, she must be played with premeditation and good decision-making to reach her full potential.",
        "https://i.ytimg.com/vi/UsP016iOQA0/maxresdefault.jpg")
    )

    heroes.add(
        hero("Zeus",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqtFirlYZLLBZ9tuR80x6_U7N3_s06hctgaA&usqp=CAU",
        "Zeus, the Lord of Heaven, is a ranged intelligence hero who functions almost solely as a nuker. He is usually played as a semi-carry ganker type hero, who instead of utilizing disables, focuses solely on delivering tremendous amounts of magical damage to his foes. With the high cast range, and ease of use and low cooldown on his spells, he is able to deliver the most superb and consistent magical damage of any hero in the game.",
        "https://estnn.com/wp-content/uploads/2020/06/zeus-dota-2.jpg")
    )

    heroes.add(
        hero("Lina",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqtFirlYZLLBZ9tuR80x6_U7N3_s06hctgaA&usqp=CAU",
        "Lina, the Slayer, is a ranged intelligence hero, adept at destroying enemy heroes quickly by delivering massive bursts of magical damage, making her one of the most effective gankers in the game. She possesses immense damaging capabilities all throughout the game, but is very fragile. Two of her fiery spells are her main source of damage, Dragon Slave sends a wave of fire to burn enemies in her path while Light Strike Array stuns them with a concentrated pillar of solar flame. Each of her spells deals great damage early on and has a low cooldown. Her Fiery Soul bolsters her attack and movement speed every time she casts a spell, which gives her scaling damage for the later game. Laguna Blade, her ultimate, is her ace in the hole",
        "data:image/jpeg;base64,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")
    )

    heroes.add(
        hero("Chaos Knight",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3W0zklStil6nkV4P32RZ2cdYJ9QJRvzLhPQ&usqp=CAU",
        "Chaos Knight is a melee strength hero with one of the highest physical damage output ceilings of all heroes. He is mostly played as a carry and ganker. As his name implies, he has a theme based on randomness and uncertainty. His regular attack has an incredibly wide thirty damage spread, making his last hitting ability somewhat unreliable. Chaos Bolt is his most notorious luck-based ability which, at max level, can stun a target anywhere  Reality Rift pulls Chaos Knight and his target to a predetermined point along the line between the two and reduces the foe's armor. Chaos Strike is a crit-based ability with a proc chance and has random damage values. The four illusions produced by his ultimate Phantasm, that can deal up to his full attack damage at max level, benefit from his Chaos Strike and can teleport alongside him to attack the target whenever he uses Reality Rift.",
        "https://static-prod.weplay.tv/2020-04-07/w-2048/webp/bd77087d3853c926dda50b6f5eaa07d4_large_cover.341209-C74111-927868.jpeg" )
    )

    heroes.add(
        hero("Shadow Shaman",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqtFirlYZLLBZ9tuR80x6_U7N3_s06hctgaA&usqp=CAU",
        "Rhasta, the Shadow Shaman, is a ranged intelligence hero mostly played as a pusher and disabler, wielding abilities that make pushing lanes more efficient. When his abilities are used in intelligent combos, he has one of the longest disables in game. He is also capable of disabling multiple enemy heroes, allowing him to initiate encounters as well. Though very supportive in nature, until the late game Rhasta is capable of killing lone enemy heroes with the use of his entire skill set; meaning he is more difficult to gank than most other supports. Playing Rhasta well requires good knowledge of target priority and timing; and some minor micromanagement. His peak is mid-game, but he can continue to wreak havoc on enemies all throughout the match.",
        "https://i.imgur.com/YRJcJLz.jpg")
    )

    heroes.add(
        hero("Monkey King",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROoVlLHBieGXCpyRHYYuz8Ft-mpyFFBxwnGA&usqp=CAU",
        "Sun Wukong, the Monkey King, is a melee agility hero, best known for his slippery nature and his ability to do Mischief, deceiving his enemies by turning into trees and other objects. Armed with his magic extending staff, the Monkey King slams the ground with Boundless Strikes, and leaps to the treetops to have advantage over his foes with Tree Dance. Perched on a tree, he gains a clear view of his surroundings, allowing him to jump down on unsuspecting targets, dealing heavy damage and slowing their escape with Primal Spring. As a carry, the Monkey King is granted extra damage and lifesteal from Jingu Mastery after landing consecutive attacks on his opponents. In a teamfight, at Wukong's Command an army of clones is sent out across the battlefield to fight for him, while he himself has his armor increased.",
        "https://static-prod.weplay.tv/2020-02-02/e5c23fa25e06ce48887b1a162ec9389c_large_cover.625451-DCB8B8-ABB497.jpeg")
    )

    heroes.add(
        hero("Ember Spirit",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROoVlLHBieGXCpyRHYYuz8Ft-mpyFFBxwnGA&usqp=CAU",
        "Xin, the Ember Spirit, is a highly mobile and versatile melee agility hero whose abilities make him a slippery foe who can dance around his enemies at will. His skill set allows for aggressive assaults on other heroes, as he can engage on them from long range using Sleight of Fist and tie them down with Searing Chains. His Flame Guard ability deals damage in a small area around him while shielding him from magic nukes, making him a force to be reckoned with by enemy casters. Finally, his Fire Remnant spell enables him to engage, escape, or move instantaneously around the map, allowing him to appear where the enemy least expects and disappear just as quickly.",
        "https://cdn1.dotesports.com/wp-content/uploads/2018/08/11142025/ba87965c-382e-403d-b764-98f9baae54ac.png")
    )

    heroes.add(
        hero("Kunkka",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3W0zklStil6nkV4P32RZ2cdYJ9QJRvzLhPQ&usqp=CAU",
        "Kunkka, the Admiral, is a versatile melee strength hero built with an arsenal of powerful area-of-effect (AoE) spells. Two of his active spells are nukes that have long delay times, but can disable and disrupt the enemies' position. He is mostly played as a carry, initiator, or even as a ganking support. Kunkka is known for his Tidebringer sword, giving him the ability to cleave a large area around him with heavy potential damage on his next attack, which refreshes at a given period of time.",
        "https://wallpapercave.com/wp/wp3152271.jpg")
    )

    return heroes
}