
/***************************************************************************
 *   Copyright 2006-2013 by Christian Ihle                                 *
 *   kontakt@usikkert.net                                                  *
 *                                                                         *
 *   This file is part of KouChat.                                         *
 *                                                                         *
 *   KouChat is free software; you can redistribute it and/or modify       *
 *   it under the terms of the GNU Lesser General Public License as        *
 *   published by the Free Software Foundation, either version 3 of        *
 *   the License, or (at your option) any later version.                   *
 *                                                                         *
 *   KouChat is distributed in the hope that it will be useful,            *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU      *
 *   Lesser General Public License for more details.                       *
 *                                                                         *
 *   You should have received a copy of the GNU Lesser General Public      *
 *   License along with KouChat.                                           *
 *   If not, see <http://www.gnu.org/licenses/>.                           *
 ***************************************************************************/

package net.usikkert.kouchat.android.testsuite;

import net.usikkert.kouchat.android.AboutTest;
import net.usikkert.kouchat.android.HitchhikerTest;
import net.usikkert.kouchat.android.MainChatTest;
import net.usikkert.kouchat.android.NotificationTest;
import net.usikkert.kouchat.android.PrivateChatErrorHandlingTest;
import net.usikkert.kouchat.android.PrivateChatStateTest;
import net.usikkert.kouchat.android.PrivateChatTest;
import net.usikkert.kouchat.android.SendFileTest;
import net.usikkert.kouchat.android.SettingsTest;
import net.usikkert.kouchat.android.TopicTest;
import net.usikkert.kouchat.android.UserListTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Runs all the implemented tests.
 *
 * @author Christian Ihle
 */
public class AllTests extends TestSuite {

    public static Test suite() {
        final TestSuite testSuite = new TestSuite("All Android tests");

        testSuite.addTestSuite(AboutTest.class);
        testSuite.addTestSuite(MainChatTest.class);
        testSuite.addTestSuite(PrivateChatTest.class);
        testSuite.addTestSuite(PrivateChatStateTest.class);
        testSuite.addTestSuite(PrivateChatErrorHandlingTest.class);
        testSuite.addTestSuite(SettingsTest.class);
        testSuite.addTestSuite(TopicTest.class);
        testSuite.addTestSuite(UserListTest.class);
        testSuite.addTestSuite(HitchhikerTest.class);
        testSuite.addTestSuite(NotificationTest.class);
        testSuite.addTestSuite(SendFileTest.class);

        // Run these manually:
//        testSuite.addTestSuite(LinkTest.class);

        return testSuite;
    }
}
